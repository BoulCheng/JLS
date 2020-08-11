- set a system property

- To set a system property statically, use the -D option of the java command. For example, to run an application named MyApp and set the javax.net.ssl.trustStore system property to specify a truststore named MyCacertsFile , type the following:
```
java -Djavax.net.ssl.trustStore=MyCacertsFile MyApp

```

- To set a system property dynamically, call the java.lang.System.setProperty method in your code substituting the appropriate property name and value:

```
System.setProperty(propertyName,"propertyValue");

```
- For example, a setProperty call corresponding to the previous example for setting the javax.net.ssl.trustStore system property to specify a truststore named MyCacertsFile would be:

```
System.setProperty("javax.net.ssl.trustStore","MyCacertsFile");

```

- Reading System Properties
- The getProperty method returns a string containing the value of the property. If the property does not exist, this version of getProperty returns null.
```
System.getProperty("path.separator");

```

- The other version of getProperty requires two String arguments: the first argument is the key to look up and the second argument is a default value to return if the key cannot be found or if it has no value.
```
System.getProperty("subliminal.message", "Buy StayPuft Marshmallows!");

```