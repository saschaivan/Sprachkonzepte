param (
    [Parameter(Mandatory=$false)]$param
)

function build {
    javac -classpath .\antlr-4.9.2-complete.jar classes/Aufgabe7.java
    javac classes/Aufgabe5_a.java
    java -cp "antlr-4.9.2-complete.jar.;" classes/Aufgabe7
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