param (
    [Parameter(Mandatory=$false)]$parser,
    [Parameter(Mandatory=$false)]$file
)

function buildTokens {
    try {
        java -jar antlr-4.9.2-complete.jar .\SaschLexer.g4
        javac -classpath .\antlr-4.9.2-complete.jar .\Sasch*.java
        java -cp "antlr-4.9.2-complete.jar.;" org.antlr.v4.gui.TestRig Sasch tokens -tokens $file
    }
    catch {
        Write-Error "Something went wrong"
    }
}

function buildGui {
    try {
        java -jar antlr-4.9.2-complete.jar .\SaschLexer.g4 
        java -jar antlr-4.9.2-complete.jar .\SaschParser.g4
        javac -classpath .\antlr-4.9.2-complete.jar .\Sasch*.java
        java -cp ".;.\antlr-4.9.2-complete.jar" org.antlr.v4.gui.TestRig Sasch game -gui $file
    }
    catch {
        Write-Error "Something went wrong"
    }
}

function buildAST {
    try {
        java -jar antlr-4.9.2-complete.jar .\SaschLexer.g4 
        java -jar antlr-4.9.2-complete.jar .\SaschParser.g4
        javac -classpath .\antlr-4.9.2-complete.jar .\Sasch*.java
        javac .\Side.java
        javac .\Matchup.java
        javac .\Game.java
        javac -cp ".;.\antlr-4.9.2-complete.jar" .\ExprBuilder.java
        javac -cp ".;.\antlr-4.9.2-complete.jar" .\ExprToAst.java
        java -cp ".;.\antlr-4.9.2-complete.jar" ExprToAst $file
    }
    catch {
        Write-Error "Something went wrong"
    }
}

function clean {
    Remove-Item *.class
    Remove-Item *.interp
    Remove-Item *.token*
    Remove-Item Sasch*.java
}

switch ($parser) {
    gui { 
        buildGui
    }
    ast {
        buildAST
    }
    clean {
        clean
    }
    Default {
        buildTokens
    }
}
