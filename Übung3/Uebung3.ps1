param (
    [Parameter(Mandatory=$false)]$parser,
    [Parameter(Mandatory=$false)]$file
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
        javac -classpath antlr-4.9.2-complete.jar .\Sasch.java
        java -jar antlr-4.9.2-complete.jar .\SaschParser.g4
        javac -classpath antlr-4.9.2-complete.jar .\SaschParser*.java
        java -cp ".;.\antlr-4.9.2-complete.jar" org.antlr.v4.gui.TestRig Sasch game -gui $file
    }
    catch {
        Write-Error "Something went wrong"
    }
}

function buildAST {
    javac .\Matchup.java
    javac .\Game.java
    javac .\Side.java
    javac -cp ".;.\antlr-4.9.2-complete.jar" .\ExprBuilder.java
    javac -cp ".;.\antlr-4.9.2-complete.jar" .\ExprToAst.java
    java -cp ".;.\antlr-4.9.2-complete.jar" ExprToAst
}

switch ($parser) {
    gui { 
        buildGui
    }
    AST {
        buildAST
    }
    Default {
        buildTokens
    }
}
