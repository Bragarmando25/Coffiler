@echo off
setlocal enabledelayedexpansion
color 0A
title Coffiler - The Ultimate Compiler

set "PROJECT_DIR=%~dp0"
set "EXAMPLES_DIR=%PROJECT_DIR%examples"
set "GENERATED_DIR=%PROJECT_DIR%generated"

if not exist "%EXAMPLES_DIR%" mkdir "%EXAMPLES_DIR%"
if not exist "%GENERATED_DIR%" mkdir "%GENERATED_DIR%"

:MENU
cls
echo.
echo  =============================================================
echo  ^|                C O F F I L E R   V 1 . 0                ^|
echo  =============================================================
echo  ^| [C] Compilar COFFILER (Maven)                             ^|
echo  ^|-----------------------------------------------------------^|
echo  ^| EXAMPLES:                                                 ^|
set /a count=0
for %%f in ("%EXAMPLES_DIR%\*.coffie") do (
    set /a count+=1
    set "file!count!=%%~nxf"
    echo  ^| [!count!] Run: %%~nxf
)
echo  ^|-----------------------------------------------------------^|
echo  ^| [0] Exit                                                  ^|
echo  =============================================================
echo.
set "choice="
set /p choice="> Select Option: "

:: Protecao e Opcoes Fixas
if "%choice%"=="" goto MENU
if "%choice%"=="0" exit /b
if /i "%choice%"=="C" goto COMPILE_MAVEN

:: Verifica se a escolha e um numero valido de arquivo
if %choice% gtr 0 (
    if %choice% leq %count% (
        set "selected_file=!file%choice%!"
        goto RUN_FILE
    )
)

goto MENU

:COMPILE_MAVEN
cls
echo Compiling Project...
call mvn.cmd clean compile
pause
goto MENU

:RUN_FILE
set "base_name=%selected_file:~0,-7%"
cls
echo =============================================================
echo  PROCESSING: %selected_file%
echo =============================================================

echo [1/3] Compiling to Assembly...
call mvn.cmd -q exec:java "-Dexec.mainClass=coffie.Main" "-Dexec.args=%EXAMPLES_DIR%\%selected_file%"
if %errorlevel% neq 0 (
    color 0C
    echo [FAIL] Compilation Error.
    pause
    color 0A
    goto MENU
)

echo [2/3] Assembling (NASM)...
nasm -f win64 "%GENERATED_DIR%\%base_name%.asm" -o "%GENERATED_DIR%\%base_name%.obj"
if %errorlevel% neq 0 (
    color 0C
    echo [FAIL] NASM Error.
    pause
    color 0A
    goto MENU
)

echo [3/3] Linking (GCC)...
gcc "%GENERATED_DIR%\%base_name%.obj" -o "%GENERATED_DIR%\%base_name%.exe"
if %errorlevel% neq 0 (
    color 0C
    echo [FAIL] GCC Linking Error.
    pause
    color 0A
    goto MENU
)

cls
echo =============================================================
echo  EXECUTING BINARY
echo =============================================================
"%GENERATED_DIR%\%base_name%.exe"
echo.
echo =============================================================
echo  EXECUTION FINISHED
echo =============================================================
pause
goto MENU