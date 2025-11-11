@echo off
title Password Generator
cd /d "%~dp0"
mode con: cols=70 lines=22
echo Compiling Password Generator...
javac PasswordGenerator.java
echo Starting console application...
echo.
java PasswordGenerator
pause