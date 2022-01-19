param (
    [Parameter(Mandatory=$false)]$param
)

function build {
    javac -classpath .\antlr-4.9.2-complete.jar Aufgabe7.java
    java -cp "antlr-4.9.2-complete.jar.;" Aufgabe7 java.lang.String java.util.Iterator java.time.Month
}

function clean {
    Remove-Item classes/*.class
}

switch ($param) {
    clean {
        clean
    }
    default {
        build
    }
}