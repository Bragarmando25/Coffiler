@echo off
setlocal enabledelayedexpansion

:: Define o título da janela
title Coffiler - Executor de Testes

:: Define o caminho da pasta de exemplos e do projeto
set "PROJECT_DIR=%~dp0"
set "EXAMPLES_DIR=%PROJECT_DIR%examples"

:: Verifica se a pasta examples existe
if not exist "%EXAMPLES_DIR%" (
    echo [ERRO] A pasta 'examples' nao foi encontrada em: %EXAMPLES_DIR%
    echo Certifique-se de criar a pasta e colocar seus arquivos .coffie nela.
    pause
    exit /b
)

:MENU
cls
echo ==========================================
echo           COFFILER - TEST RUNNER
echo ==========================================
echo.
echo [C] Limpar e Recompilar (mvn clean package)
echo.
echo Selecione um arquivo para testar:
echo.

:: Lista os arquivos .coffie na pasta examples
set /a count=0
for %%f in ("%EXAMPLES_DIR%\*.coffie") do (
    set /a count+=1
    set "file!count!=%%~nxf"
    echo [!count!] %%~nxf
)

if %count%==0 (
    echo [AVISO] Nenhum arquivo .coffie encontrado na pasta examples.
    echo Adicione arquivos como 'teste.coffie' para testar.
    echo.
    pause
    exit /b
)

echo.
echo [0] Sair
echo.
set /p choice="Escolha uma opcao: "

:: Verifica se o usuário quer sair
if /i "%choice%"=="0" exit /b

:: Opção de Recompilar
if /i "%choice%"=="C" (
    cls
    echo ==========================================
    echo Recompilando o Projeto...
    echo ==========================================
    call mvn clean package
    echo.
    pause
    goto MENU
)

:: Valida a escolha numérica
if %choice% gtr %count% (
    echo Opcao invalida! Tente novamente.
    timeout /t 2 >nul
    goto MENU
)
if %choice% lss 0 (
    echo Opcao invalida! Tente novamente.
    timeout /t 2 >nul
    goto MENU
)

:: Recupera o nome do arquivo escolhido
set "selected_file=!file%choice%!"

cls
echo ==========================================
echo Executando: %selected_file%
echo ==========================================
echo.

:: Executa o Maven com o arquivo selecionado
:: Usa aspas simples para compatibilidade com PowerShell se chamado de lá, 
:: mas aqui no CMD puro aspas duplas funcionam melhor para o Exec plugin.
echo Comando: mvn exec:java "-Dexec.mainClass=coffie.Main" "-Dexec.args=examples\%selected_file%"
echo.

call mvn exec:java "-Dexec.mainClass=coffie.Main" "-Dexec.args=examples\%selected_file%"

echo.
echo ==========================================
echo Execucao finalizada.
echo ==========================================
echo.
pause
goto MENU