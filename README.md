# CoffieLang 
Compilador baseado em Java, criado com ANTLR 4.

## Estrutura
- `grammar/` → gramática ANTLR (`.g4`)
- `src/` → código Java gerado e código principal
- `build/` → arquivos compilados
- `scripts/` → scripts para compilar e rodar

## Como rodar
1. Configure o ANTLR:
   ```bash
   $env:CLASSPATH = ".;antlr-4.13.2-complete.jar;$env:CLASSPATH"

2. Compilar:
    ```bash
    java -jar antlr-4.13.2-complete.jar grammar/CoffieLang.g4 -o src
    javac -cp ".;antlr-4.13.2-complete.jar" src/*.java -d build

3. Executar:
    ```bash
    java -cp ".;antlr-4.13.2-complete.jar;build" org.antlr.v4.gui.TestRig CoffieLang program -gui examples/teste.txt
