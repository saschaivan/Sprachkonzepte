param (
    [Parameter(Mandatory=$true)]$file,
    [Parameter(Mandatory=$false)]$parser
)

function buildTokens {
    try {
        java -jar antlr-4.9.2-complete.jar .\Sasch.g4
        javac -classpath .\antlr-4.9.2-complete.jar .\Sasch.java
        java -cp "antlr-4.9.2-complete.jar.;" org.antlr.v4.gui.TestRig Sasch tokens -tokens $file
    }
    catch {
        Write-Error "Something went wrong"
    }
}

function buildGui {
    try {
        java -jar antlr-4.9.2-complete.jar .\SaschParser.g4
        javac -classpath .\antlr-4.9.2-complete.jar .\SaschParser.java
        java -cp "antlr-4.9.2-complete.jar.;" org.antlr.v4.gui.TestRig SaschParser matchup -gui $file
    }
    catch {
        Write-Error "Something went wrong"
    }
}

switch ($parser) {
    gui { 
        buildGui
    }
    Default {
        buildTokens
    }
}
