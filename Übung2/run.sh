#!/bin/sh
echo "run antlr4"
java -jar antlr-4.9.2-complete.jar TimeSimple.g4
echo "compiling the java file"
javac -classpath ".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH" TimeSimple.java
echo "run the program"
java -classpath ".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig TimeSimple tokens -tokens < timeBeispiel.txt