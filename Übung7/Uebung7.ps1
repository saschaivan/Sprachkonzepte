param (
    [Parameter(Mandatory=$false)]$param
)

function build {
    javac -classpath .\antlr-4.9.2-complete.jar Aufgabe7.java
    java -cp "antlr-4.9.2-complete.jar.;" Aufgabe7
}

function clean {
    Remove-Item *.class
}

switch ($param) {
    clean {
        clean
    }
    default {
        build
    }
}