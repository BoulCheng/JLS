
- PATH

- You can run the JDK just fine without setting the PATH variable, or you can optionally set it as a convenience.
-  However, you should set the path variable if you want to be able to run the executables (javac, java, javadoc, and so on) from any directory without having to type the full path of the command
- If you do not set the PATH variable, you need to specify the full path to the executable every time you run it, such as:
```
% /usr/local/jdk1.7.0/bin/javac MyClass.java

```
- To find out if the path is properly set, execute:
```
% java -version

```
- This will print the version of the java tool, if it can find it. If the version is old or you get the error java: Command not found, then the path is not properly set.


- To set the path permanently, set the path in your startup file.
- for mac (~/.bash_profile)
- For sh, edit the profile file (~/.profile):
```
PATH=/usr/local/jdk1.7.0/bin:$PATH
export PATH
```

- Then load the startup file and verify that the path is set by repeating the java command:
```
% source ~/.bash_profile
% java -version
```