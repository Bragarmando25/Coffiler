☕ CoffieLang
============

Este projeto implementa um compilador para a linguagem **CoffieLang** (uma versão simplificada de Java/C), desenvolvido com **ANTLR 4** e **Java**.

📂 Estrutura do Projeto
-----------------------

*   **src/main/antlr4/coffie/**: Contém a gramática CoffieLang.g4.
    
*   **src/main/java/coffie/**: Contém o código fonte Java (Main.java, SemanticAnalyzer.java, SymbolTable.java).
    
*   **examples/**: Contém exemplos de código (.coffie) para testar o compilador.
    
*   **target/**: Diretório gerado pelo Maven com os arquivos compilados (Lexer, Parser e .class).
    

🛠️ Requisitos
--------------

*   **Java JDK 21+**: O projeto está configurado para Java 21.

🚀 Como Compilar
----------------

Antes de executar qualquer teste, é necessário compilar o projeto para gerar o Lexer, Parser e compilar as classes Java.

1.  Abra o terminal na pasta raiz do projeto (D:\\Coffiler).
    
2.  mvn clean package**Aguarde a mensagem BUILD SUCCESS.**
    

💻 Como Executar (Modo Fácil)
-----------------------------

Utilize o script automatizado run\_tests.bat para selecionar e rodar os arquivos de exemplo sem precisar digitar comandos longos.

1.  Na pasta raiz, clique duas vezes no arquivo run\_tests.bat (ou execute .\\run\_tests.bat no terminal).
    
2.  Um menu será exibido com os arquivos disponíveis na pasta examples/.
    
3.  Digite o **número** do arquivo que deseja testar e pressione **Enter**.
    

O script irá compilar (se necessário) e executar o compilador sobre o arquivo escolhido, exibindo o resultado da análise léxica, sintática e semântica.

⌨️ Como Executar (Modo Manual)
------------------------------

Se preferir rodar manualmente via linha de comando:

mvn exec:java "-Dexec.mainClass=coffie.Main" "-Dexec.args=examples\teste.coffie"  `

> **Nota:** Substitua examples\\teste.coffie pelo caminho do arquivo que deseja analisar.
