@echo off
set ANTLR=antlr-4.13.2-complete.jar
set SRC=src
set GRAMMAR=gramar\CoffieLang.g4
set BUILD=build

echo [1/3] generating lexer and parser...
java -jar %ANTLR% -o %SRC% %GRAMMAR%

echo [2/3] Compiling Java Files...
javac -cp ".;%ANTLR%" %SRC%\*.java -d %BUILD%

echo [3/3] Running the compiler...
java -cp ".;%ANTLR%;%BUILD%" Main examples\teste.c