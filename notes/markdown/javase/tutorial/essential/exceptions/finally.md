# finally

- it allows the programmer to avoid having cleanup code accidentally bypassed by a return, continue, or break.(i.e., 它允许程序员避免让清理代码意外地绕过return, continue, or break。)

- Note: If the JVM exits while the try or catch code is being executed, then the finally block may not execute. Likewise, if the thread executing the try or catch code is interrupted or killed, the finally block may not execute even though the application as a whole continues.