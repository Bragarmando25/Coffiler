@echo off
setlocal
set ANTLR_JAR=antlr-4.13.2-complete.jar
set CLASSPATH=.;%ANTLR_JAR%;%CLASSPATH%

echo [1/3] Gerando fontes com ANTLR...
java -jar %ANTLR_JAR% -Dlanguage=Java -visitor -o src grammar\CoffieLang.g4 || goto :err

echo [2/3] Compilando...
javac -cp ".;%ANTLR_JAR%" src\*.java -d build || goto :err

echo [3/3] OK.
exit /b 0
:err
echo ERRO no build.
exit /b 1