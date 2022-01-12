import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.ST;
import java.lang.reflect.Method;
import java.io.FileWriter;   

public final class Aufgabe7 {
	private Aufgabe7() { }

	public static void main(String[] args) throws Exception {
		//Class aufgabe7 = Class.forName("Aufgabe7");
		Method[] methods = Class.forName("Aufgabe7").getMethods();
        ST templ = new STGroupFile("aufgabe7.stg").getInstanceOf("aufgabe7");
        templ.add("methods", methods);
        String result = templ.render();
        //System.out.println(result);

		FileWriter myWriter = new FileWriter("output.html");
		myWriter.write(result);
		myWriter.close();	
    }

	public void test() { }
	public void test2() { }
}