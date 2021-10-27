param (
    [Parameter(Mandatory=$true)]$file
)
try {
    java -jar antlr-4.9.2-complete.jar .\TimeSimple.g4
    javac -classpath .\antlr-4.9.2-complete.jar .\TimeSimple.java
    java -cp "antlr-4.9.2-complete.jar.;" org.antlr.v4.gui.TestRig TimeSimple tokens -tokens $file
}
catch {
    Write-Error "Something went wrong"
}