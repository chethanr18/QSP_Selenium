Run("c:\Windows\system32\calc.exe")
WinActivate("Calculator")
sleep(1000)
send("7-2")
sleep(1000)
Send("{ENTER}")
sleep(1000)
WinClose("Calculator")