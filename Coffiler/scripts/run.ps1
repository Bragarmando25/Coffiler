# Configura o classpath
$env:CLASSPATH = ".;../antlr-4.13.2-complete.jar;$env:CLASSPATH"

# Compila a gramática
java -jar ../antlr-4.13.2-complete.jar ../grammar/CoffieLang.g4 -o ../src

# Compila os .java
javac -cp ".;../antlr-4.13.2-complete.jar" ../src/*.java -d ../build

# Executa o TestRig no exemplo
java -cp ".;../antlr-4.13.2-complete.jar;../build" org.antlr.v4.gui.TestRig CoffieLang program -gui ../examples/teste.txt
