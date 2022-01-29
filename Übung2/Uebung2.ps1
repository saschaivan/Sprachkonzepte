param (
	[Parameter(Mandatory = $true)]$parser,
	[Parameter(Mandatory = $false)]$file
)

function buildTimeSimple {
	java -jar antlr-4.9.2-complete.jar .\TimeSimpleLexer.g4
	javac -classpath .\antlr-4.9.2-complete.jar .\TimeSimpleLexer.java
	java -cp "antlr-4.9.2-complete.jar.;" org.antlr.v4.gui.TestRig TimeSimple tokens -tokens $file
	
}

function buildTime {
	java -jar antlr-4.9.2-complete.jar .\TimeLexer.g4
	javac -classpath .\antlr-4.9.2-complete.jar .\TimeLexer.java
	java -cp "antlr-4.9.2-complete.jar.;" org.antlr.v4.gui.TestRig Time tokens -tokens $file
	
}

function clean {
	Remove-Item *.class
	Remove-Item *.interp
	Remove-Item *.token*
}

switch ($parser) {
	buildSimple {
		buildTimeSimple
	}
	build {
		buildTime
	}
	clean {
		clean
	}
}