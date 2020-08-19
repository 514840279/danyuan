===================================
@echo %%i：文件完整信
@echo %%~di：文件所在驱动器信息
@echo %%~pi：文件所在路径信息
@echo %%~ni：文名名信息
@echo %%~xi：文件后缀信息
@echo %%~zi：文件大小信息
@echo %%~ti：文件修改时间信息
@echo %%~dpi：文件所在驱动器和所在路径信息
@echo %%~nxi：文件名及后缀信息
@echo %%~pnxi：文件所在路径及文件名和后缀信息
@echo %%~dpni：文件驱动器、路径、文名名信息
@echo %%~dpnxi：文件驱动器、路径、文件名、后缀信息

==================================
@echo 查找开始

@echo off & setlocal EnableDelayedExpansion

for /f "delims=" %%i in ('"dir /a/s/b/on *.*"') do (

set file=%%~fi	%%~ni	%%~xi	%%~zi

set file=!file:/=/!

echo !file! >> Â·¾¶.txt

)

===================================
