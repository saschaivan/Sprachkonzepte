package classes;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.ST;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;   

public final class Aufgabe7 {
	private Aufgabe7() { }

	public static void main(String[] args) throws Exception {
		/* File classFolder = new File("classes");
		File[] listOfFiles = classFolder.listFiles();
		ArrayList<Classes> classArray = new ArrayList<Classes>();
		for (int i = 0; i < listOfFiles.length; i++) {
			String[] fileName = listOfFiles[i].getName().split("\\."); 
			if(fileName[1].equals("java"))
				continue;
			Classes classes;
			String className = fileName[0];
			classes = new Classes(Class.forName("classes." + className).getName(), Class.forName("classes." + className).getMethods(), Class.forName("classes." + className).getInterfaces());
			classArray.add(classes);
		} */
        ST templ = new STGroupFile("aufgabe7.stg").getInstanceOf("aufgabe7");
		
		ArrayList<Classes> classArray = new ArrayList<Classes>();
		Class<?> classforName = Class.forName(args[0]);
		Classes classes;
		IntefaceMethods interfaceMethods;
		if(classforName.isInterface())



        templ.add("classes", classArray);
        String result = templ.render();

		FileWriter myWriter = new FileWriter("output.html");
		myWriter.write(result);
		myWriter.close();	
    }
}


abstract class OberKlasse {
	public Class<?>[] interfaces;
	public Method[] methods;
}

final class Classes extends OberKlasse {
	public final String name;
	public final IntefaceMethods interfaces;

	public Classes(String name, IntefaceMethods interfaces) {
		this.name = name;
		this.interfaces = interfaces;
	}
}

final class IntefaceMethods extends OberKlasse {
	public final String name;
	public final Method[] methods;

	public IntefaceMethods(String name, Method[] methods) {
		this.methods = methods;
		this.name = name;
	}
}