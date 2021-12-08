param (
    [Parameter(Mandatory=$true)]$param
)

function build {
    javac .\Aufgabe5_a.java
    javac .\Aufgabe5_b.java
    java  Aufgabe5_a $param
    java  Aufgabe5_b $param
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