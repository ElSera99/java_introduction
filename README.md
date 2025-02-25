# Java Introduction

Based on the Youtube video from creator *Programming With Mosh*:
- https://www.youtube.com/watch?v=eIrMbAQSU34

# How to run the programs
In order to correctly execute the java applications, first is required to create the **class** object.
Which later will be executed inside the **JVM**.
The **JVM** takes the Java bytecode(.class) and translates to the native code for the overlying machine.

This makes Java applications platform independent, you can write a Java program and execute it in any operative systems.

## Create bytecode(.class) object
Inside the terminal, call for the compiler `javac` followed by the name of the application(.java) as:
```shell
javac <JAVA_FILE_PATH> -d <OUTPUT_FOLDER>
```
This will create the *.class* file and store it into the output folder.

## Execute application
Now that the *.class* file is available, it can be executed with the JVM by using the command `java`.
Fist locate the folder where the *.class* files are being stored.
And remember to call your class by PascalCase naming convention as:

```shell
java -cp <OUTPUT_DIR> <JAVA_CLASS>
```