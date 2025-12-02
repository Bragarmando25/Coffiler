package coffie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AsmGenerator {

    private final List<TacInstruction> instructions;
    private final StringBuilder code = new StringBuilder();
    private final Map<String, Integer> stackMap = new HashMap<>();
    private final Set<String> stringLabels = new HashSet<>(); 
    private final Set<String> bigVars = new HashSet<>(); 
    private final Map<String, Integer> fieldOffsets = new HashMap<>(); 
    
    // Conjunto de variáveis que sabemos serem FLOAT
    private final Set<String> floatVars = new HashSet<>(); 
    
    private int currentStackOffset = 0;
    private final Queue<String> paramQueue = new LinkedList<>();

    public AsmGenerator(List<TacInstruction> instructions) {
        this.instructions = instructions;
    }

    public void generate(String outputPath) throws IOException {
        code.append("global main\nextern printf, scanf, gets, puts, exit, atoi, atof\n\nsection .data\n");
        code.append("    fmt_int_in:  db \"%d\", 0\n");

        int strCount = 0;
        int currentFieldOffset = 0;
        boolean isUnion = false;

        // =========================================================
        // PASS 1: SCANNER & TYPE PROPAGATION (FORTALECIDO)
        // =========================================================
        boolean changed;
        do {
            changed = false;
            for (TacInstruction i : instructions) {
                // 1. Strings
                if (isString(i.arg1) && !i.arg1.startsWith("str")) {
                    String lbl = "str" + (strCount++);
                    code.append("    ").append(lbl).append(": db `").append(extractStr(i.arg1)).append("`, 0\n");
                    i.arg1 = lbl;
                    stringLabels.add(lbl);
                }
                if (isString(i.arg2) && !i.arg2.startsWith("str")) {
                    String lbl = "str" + (strCount++);
                    code.append("    ").append(lbl).append(": db `").append(extractStr(i.arg2)).append("`, 0\n");
                    i.arg2 = lbl;
                    stringLabels.add(lbl);
                }

                // 2. Structs/Arrays (Big Vars)
                if (i.op == TacInstruction.OpCode.ARR_STORE || i.op == TacInstruction.OpCode.ARR_LOAD) {
                    if(i.result != null) bigVars.add(i.result);
                    if(i.arg1 != null) bigVars.add(i.arg1);
                }
                if (i.result != null && i.result.contains(".")) bigVars.add(i.result.split("\\.")[0]);

                // 3. Offsets de Structs
                if (i.op == TacInstruction.OpCode.DEF_START) {
                    currentFieldOffset = 0;
                    isUnion = "union".equals(i.arg1);
                } else if (i.op == TacInstruction.OpCode.DEF_FIELD) {
                    fieldOffsets.put(i.result, currentFieldOffset); 
                    if (!isUnion) currentFieldOffset += 8; 
                }

                // 4. Lógica de FLOAT (CRÍTICO PARA O ERRO)
                
                // Caso A: Declaração explícita (float x;)
                if (i.op == TacInstruction.OpCode.DECL_VAR && i.arg1 != null && (i.arg1.contains("float") || i.arg1.contains("double"))) {
                    if (i.result != null && !floatVars.contains(i.result)) {
                        floatVars.add(i.result);
                        changed = true;
                    }
                }
                
                // Caso B: Atribuição (x = 5.5 ou x = y_float)
                if (i.op == TacInstruction.OpCode.ASSIGN) {
                    if (isFloatOrLit(i.arg1)) {
                        if (i.result != null && !floatVars.contains(i.result)) {
                            floatVars.add(i.result);
                            changed = true;
                        }
                    }
                }

                // Caso C: Operações (t0 = y_float * 2)
                // Se qualquer operando for float, o resultado (temp) vira float
                if (i.op == TacInstruction.OpCode.ADD || i.op == TacInstruction.OpCode.SUB || 
                    i.op == TacInstruction.OpCode.MULT || i.op == TacInstruction.OpCode.DIV) {
                    
                    if (isFloatOrLit(i.arg1) || isFloatOrLit(i.arg2)) {
                        if (i.result != null && !floatVars.contains(i.result)) {
                            floatVars.add(i.result);
                            changed = true;
                        }
                    }
                }
            }
        } while (changed); // Repete até propagar todos os tipos

        code.append("\nsection .text\ndefault rel\n");
        mapVariables(); 

        // =========================================================
        // PASS 2: GERADOR
        // =========================================================
        for (TacInstruction instr : instructions) {
            code.append("    ; ").append(instr.toString()).append("\n");
            switch (instr.op) {
                case LABEL -> {
                    code.append(instr.result).append(":\n");
                    if (!instr.result.startsWith("L")) prologue();
                }
                case DECL_VAR -> { }
                case ADDR -> { 
                    int off = getOffset(instr.arg1);
                    code.append("    lea rax, [rbp").append(off).append("]\n");
                    saveToMem("rax", instr.result);
                }
                case DEREF_LOAD -> { 
                    loadToReg("rax", instr.arg1); 
                    code.append("    mov rax, [rax]\n"); 
                    saveToMem("rax", instr.result);
                }
                case DEREF_STORE -> { 
                    loadToReg("rax", instr.arg1); 
                    loadToReg("rbx", instr.arg2); 
                    code.append("    mov [rax], rbx\n");
                }
                case ASSIGN -> {
                    loadToReg("rax", instr.arg1); 
                    saveToMem("rax", instr.result);
                }
                case ADD -> { 
                    if (isFloatOrLit(instr.result)) genFloatOp("addss", instr); 
                    else { loadToReg("rax", instr.arg1); loadToReg("rbx", instr.arg2); code.append("    add rax, rbx\n"); saveToMem("rax", instr.result); }
                }
                case SUB -> { 
                    if (isFloatOrLit(instr.result)) genFloatOp("subss", instr);
                    else { loadToReg("rax", instr.arg1); loadToReg("rbx", instr.arg2); code.append("    sub rax, rbx\n"); saveToMem("rax", instr.result); }
                }
                case MULT -> { 
                    if (isFloatOrLit(instr.result)) genFloatOp("mulss", instr);
                    else { loadToReg("rax", instr.arg1); loadToReg("rbx", instr.arg2); code.append("    imul rax, rbx\n"); saveToMem("rax", instr.result); }
                }
                case DIV -> { 
                    if (isFloatOrLit(instr.result)) genFloatOp("divss", instr);
                    else { loadToReg("rax", instr.arg1); loadToReg("rbx", instr.arg2); code.append("    cqo\n    idiv rbx\n"); saveToMem("rax", instr.result); }
                }
                case MOD -> { 
                    loadToReg("rax", instr.arg1); loadToReg("rbx", instr.arg2); code.append("    cqo\n    idiv rbx\n    mov rax, rdx\n"); saveToMem("rax", instr.result); 
                }
                case PRINT -> {
                    String[] intRegs = {"rdx", "r8", "r9"}; 
                    String[] xmmRegs = {"xmm1", "xmm2", "xmm3"}; 
                    int i = 0;
                    while(!paramQueue.isEmpty() && i < 3) {
                        String val = paramQueue.poll();
                        loadToReg("rax", val); 
                        
                        // Passa como INT (bits brutos ou valor int)
                        code.append("    mov ").append(intRegs[i]).append(", rax\n");
                        
                        // Passa como FLOAT (garante bits limpos e conversão para double)
                        code.append("    movd ").append(xmmRegs[i]).append(", eax\n");
                        code.append("    cvtss2sd ").append(xmmRegs[i]).append(", ").append(xmmRegs[i]).append("\n");
                        
                        i++;
                    }
                    paramQueue.clear();
                    code.append("    lea rcx, [").append(instr.arg1).append("]\n");
                    code.append("    sub rsp, 32\n    call printf\n    add rsp, 32\n");
                }
                case SCAN -> {
                    loadToReg("rdx", instr.result); 
                    code.append("    lea rcx, [fmt_int_in]\n");
                    code.append("    sub rsp, 32\n    call scanf\n    add rsp, 32\n");
                }
                case GETS -> {
                    int off = getOffset(instr.result);
                    code.append("    lea rcx, [rbp").append(off).append("]\n");
                    code.append("    sub rsp, 32\n    call gets\n    add rsp, 32\n");
                }
                case PUTS -> {
                    if (stringLabels.contains(instr.arg1)) {
                        code.append("    lea rcx, [").append(instr.arg1).append("]\n");
                    } else {
                        int off = getOffset(instr.arg1);
                        code.append("    lea rcx, [rbp").append(off).append("]\n");
                    }
                    code.append("    sub rsp, 32\n    call puts\n    add rsp, 32\n");
                }
                case PARAM -> paramQueue.add(instr.arg1);
                case CALL -> {
                    String[] regs = {"rcx", "rdx", "r8", "r9"};
                    int c = 0;
                    while(!paramQueue.isEmpty() && c < 4) loadToReg(regs[c++], paramQueue.poll());
                    paramQueue.clear();
                    code.append("    sub rsp, 32\n    call ").append(instr.arg1).append("\n    add rsp, 32\n");
                    if(instr.result != null) saveToMem("rax", instr.result);
                }
                case POP_PARAM -> {
                    int idx = Integer.parseInt(instr.arg1);
                    String[] regs = {"rcx", "rdx", "r8", "r9"};
                    if (idx < 4) {
                        int offset = getOffset(instr.result);
                        code.append("    mov qword [rbp").append(offset).append("], ").append(regs[idx]).append("\n");
                    }
                }
                case RETURN -> {
                    if(instr.arg1 != null) loadToReg("rax", instr.arg1);
                    code.append("    leave\n    ret\n");
                }
                case EQ, NEQ, LT, GT, LE, GE -> generateRelational(instr);
                case AND, OR, NOT -> generateLogic(instr);
                case IF_FALSE -> {
                    loadToReg("rax", instr.arg1);
                    code.append("    cmp rax, 0\n    je ").append(instr.result).append("\n");
                }
                case GOTO -> code.append("    jmp ").append(instr.result).append("\n");
                case ARR_LOAD -> {
                    loadToReg("rbx", instr.arg2); 
                    int base = getOffset(instr.arg1);
                    code.append("    movsxd rbx, ebx\n"); 
                    code.append("    imul rbx, 8\n    neg rbx\n");
                    code.append("    mov rax, qword [rbp").append(base).append("+rbx]\n");
                    saveToMem("rax", instr.result);
                }
                case ARR_STORE -> {
                    loadToReg("rbx", instr.arg1); 
                    loadToReg("rcx", instr.arg2); 
                    int base = getOffset(instr.result);
                    code.append("    movsxd rbx, ebx\n");
                    code.append("    imul rbx, 8\n    neg rbx\n");
                    code.append("    mov qword [rbp").append(base).append("+rbx], rcx\n");
                }
                default -> {}
            }
        }
        try (FileWriter writer = new FileWriter(outputPath)) { writer.write(code.toString()); }
    }

    private void mapVariables() {
        for (String var : bigVars) {
            if (!stackMap.containsKey(var)) {
                int baseAddr = currentStackOffset - 8;
                stackMap.put(var, baseAddr);
                currentStackOffset -= 128; 
            }
        }
        for (TacInstruction i : instructions) {
            allocScalar(i.result); allocScalar(i.arg1); allocScalar(i.arg2);
        }
    }
    
    private void allocScalar(String var) {
        if (var == null || isLit(var) || var.startsWith("L") || stringLabels.contains(var)) return;
        if (var.contains(".")) return;
        if (stackMap.containsKey(var)) return; 
        currentStackOffset -= 8;
        stackMap.put(var, currentStackOffset);
    }

    private int getOffset(String var) {
        if (var.contains(".")) {
            String base = var.split("\\.")[0];
            String field = var.split("\\.")[1];
            if (!stackMap.containsKey(base)) allocBig(base); 
            int baseAddr = stackMap.get(base);
            int fieldOff = fieldOffsets.getOrDefault(field, 0);
            return baseAddr - fieldOff; 
        }
        if (!stackMap.containsKey(var)) allocScalar(var);
        return stackMap.get(var);
    }
    
    private void allocBig(String var) {
        if (!stackMap.containsKey(var)) {
            int baseAddr = currentStackOffset - 8;
            stackMap.put(var, baseAddr);
            currentStackOffset -= 128; 
        }
    }
    
    private boolean isString(String s) { return s != null && s.startsWith("\""); }
    private String extractStr(String s) { return s.substring(1, s.length()-1); }
    
    // CORREÇÃO: Método robusto para identificar float
    private boolean isFloatOrLit(String var) {
        if (var == null) return false;
        if (floatVars.contains(var)) return true;
        // Regex para literal float (com ponto obrigatório)
        return var.matches("-?\\d+\\.\\d+"); 
    }
    
    private boolean isLit(String s) { 
        if (s == null) return false;
        if (s.matches("-?\\d+")) return true; 
        if (s.matches("-?\\d+\\.\\d+")) return true; 
        return s.equals("true") || s.equals("false");
    }

    // CORREÇÃO: Manipulação híbrida Int/Float
    private void genFloatOp(String asmOp, TacInstruction instr) {
        // Carrega Arg1
        loadToReg("rax", instr.arg1); 
        if (isFloatOrLit(instr.arg1)) {
            code.append("    movd xmm0, eax\n");
        } else {
            // Se for INT misturado com FLOAT, converte para Float
            code.append("    cvtsi2ss xmm0, eax\n");
        }

        // Carrega Arg2
        loadToReg("rbx", instr.arg2); 
        if (isFloatOrLit(instr.arg2)) {
            code.append("    movd xmm1, ebx\n");
        } else {
            // Se for INT misturado com FLOAT, converte para Float
            code.append("    cvtsi2ss xmm1, ebx\n");
        }
        
        // Executa Op
        code.append("    ").append(asmOp).append(" xmm0, xmm1\n");
        code.append("    movd eax, xmm0\n"); 
        saveToMem("rax", instr.result);
    }

    private void prologue() {
        code.append("    push rbp\n    mov rbp, rsp\n");
        int size = Math.abs(currentStackOffset) + 64; 
        if (size % 16 != 0) size += (16 - (size % 16));
        code.append("    sub rsp, ").append(size).append("\n");
    }
    
    private void loadToReg(String reg, String val) {
        if (val == null) return;
        
        if (val.matches("-?\\d+")) { 
            code.append("    mov ").append(reg).append(", ").append(val).append("\n");
        } 
        else if (val.matches("-?\\d+\\.\\d+")) { 
             try {
                 // CORREÇÃO: Locale.US garante que parseie "5.5" mesmo em sistemas PT-BR
                 float f = Float.parseFloat(val);
                 int bits = Float.floatToIntBits(f);
                 code.append("    mov ").append(reg).append(", ").append(bits).append(" ; float ").append(val).append("\n");
             } catch(NumberFormatException e) { code.append("    mov ").append(reg).append(", 0\n"); }
        } 
        else if (val.equals("true")) code.append("    mov ").append(reg).append(", 1\n");
        else if (val.equals("false")) code.append("    mov ").append(reg).append(", 0\n");
        else if (stringLabels.contains(val)) {
            code.append("    lea ").append(reg).append(", [").append(val).append("]\n");
        } else {
             int off = getOffset(val);
             code.append("    mov ").append(reg).append(", qword [rbp").append(off).append("]\n");
        }
    }
    
    private void saveToMem(String reg, String var) {
        int off = getOffset(var);
        code.append("    mov qword [rbp").append(off).append("], ").append(reg).append("\n");
    }
    
    private void generateLogic(TacInstruction i) {
        loadToReg("rax", i.arg1);
        if (i.op == TacInstruction.OpCode.NOT) {
             code.append("    xor rax, 1\n");
        } else {
             loadToReg("rbx", i.arg2);
             code.append(i.op == TacInstruction.OpCode.AND ? "    and rax, rbx\n" : "    or rax, rbx\n");
        }
        saveToMem("rax", i.result);
    }
    
    private void generateRelational(TacInstruction i) {
        loadToReg("rax", i.arg1); loadToReg("rbx", i.arg2);
        // Usa xmm se QUALQUER UM for float
        if (isFloatOrLit(i.arg1) || isFloatOrLit(i.arg2)) {
             if(isFloatOrLit(i.arg1)) code.append("    movd xmm0, eax\n"); else code.append("    cvtsi2ss xmm0, eax\n");
             if(isFloatOrLit(i.arg2)) code.append("    movd xmm1, ebx\n"); else code.append("    cvtsi2ss xmm1, ebx\n");
             code.append("    ucomiss xmm0, xmm1\n"); 
        } else {
             code.append("    cmp rax, rbx\n");
        }
        String set = switch(i.op) { case EQ->"sete"; case NEQ->"setne"; case LT->"setl"; case GT->"setg"; case LE->"setle"; default->"setge"; };
        code.append("    ").append(set).append(" al\n    movzx rax, al\n");
        saveToMem("rax", i.result);
    }
}