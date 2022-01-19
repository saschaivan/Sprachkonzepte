import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

public final class Aufgabe7 {
	private Aufgabe7() {
	}

	public static void main(String[] args) throws Exception {	
		ArrayList<Classes> classArray = new ArrayList<Classes>();
		for (String arg : args) {
			Class<?> classforName = Class.forName(arg);
			Classes classes = new Classes(classforName.getName(), classforName);
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
	public String name;
	public ArrayList<InterfaceMethods> interfaces = new ArrayList<>();
	public Method[] classMethods;
	public boolean isInterface;

	public Classes(String name, Class<?> classObject) {
		if (classObject.isInterface()) {
			this.name = name;
			isInterface = true;
			this.classMethods = classObject.getMethods();
		} else {
			this.name = name;
			for(Class<?> c : classObject.getInterfaces())
				interfaces.add(new InterfaceMethods(c.getName(), c.getMethods()));
		}
	}
}

final class InterfaceMethods {
	public String interfaceName;
	public Method[] interfaceMethods;

	public InterfaceMethods(String interfaceName, Method[] interfaceMethods) {
		this.interfaceMethods = interfaceMethods;
		this.interfaceName = interfaceName;
	}
}