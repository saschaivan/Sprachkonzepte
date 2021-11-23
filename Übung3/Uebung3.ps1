param (
    [Parameter(Mandatory=$false)]$file,
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
        java -jar antlr-4.9.2-complete.jar .\Sasch.g4 
        javac -classpath .\antlr-4.9.2-complete.jar .\Sasch.java
        java -jar antlr-4.9.2-complete.jar .\SaschParser.g4
        javac -classpath .\antlr-4.9.2-complete.jar .\SaschParser*.java
        java -cp ".;.\antlr-4.9.2-complete.jar" org.antlr.v4.gui.TestRig Sasch game -gui $file
    }
    catch {
        Write-Error "Something went wrong"
    }
}

function buildAST {
    try {
        java -jar antlr-4.9.2-complete.jar .\Sasch.g4 
        javac -classpath .\antlr-4.9.2-complete.jar .\Sasch.java
        java -jar antlr-4.9.2-complete.jar .\SaschParser.g4
        javac -classpath .\antlr-4.9.2-complete.jar .\SaschParser*.java
        javac .\Matchup.java
        javac .\Game.java
        javac .\Side.java
        javac -classpath .\antlr-4.9.2-complete.jar .\ExprBuilder.java
        javac -classpath .\antlr-4.9.2-complete.jar .\ExprToAst.java
        java -cp ".;.\antlr-4.9.2-complete.jar" ExprToAst
    }
    catch {
        Write-Error "Something went wrong"
    }
}

switch ($parser) {
    gui { 
        buildGui
    }
    ast {
        buildAST
    }
    Default {
        buildTokens
    }
}
