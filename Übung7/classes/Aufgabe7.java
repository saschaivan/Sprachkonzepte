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
		File classFolder = new File("classes");
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
		}

        ST templ = new STGroupFile("aufgabe7.stg").getInstanceOf("aufgabe7");
        templ.add("classes", classArray);
        String result = templ.render();

		FileWriter myWriter = new FileWriter("output.html");
		myWriter.write(result);
		myWriter.close();	
    }
}

final class Classes {
	public final String name;
	public final Method[] methods;
	public final Class<?>[] interfaces;

	public Classes(String name, Method[] methods, Class<?>[] interfaces) {
		this.name = name;
		this.methods = methods;
		this.interfaces = interfaces;
	}
}