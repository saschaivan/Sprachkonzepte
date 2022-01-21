param (
	[Parameter(Mandatory = $true)]$parser,
	[Parameter(Mandatory = $false)]$file
)

function build {
	java -jar antlr-4.9.2-complete.jar .\Time.g4
	javac -classpath .\antlr-4.9.2-complete.jar .\Time.java
	java -cp "antlr-4.9.2-complete.jar.;" org.antlr.v4.gui.TestRig Time tokens -tokens $file
	
}

function clean {
	Remove-Item *.class
	Remove-Item *.interp
	Remove-Item *.token*
}

switch ($parser) {
	build {
		build
	}
	clean {
		clean
	}
}