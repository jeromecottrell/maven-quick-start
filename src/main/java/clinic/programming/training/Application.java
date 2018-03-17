package clinic.programming.training;
// note the package name versus the directory path namely /c/Users/jcottrel/projects/maven-quick-start/src/main/java/clinic/programming/training

import java.util.ArrayList;
import java.util.List;

public class Application {
    
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for (String greeting : greetings){
			System.out.println("Greeting" + greeting);
		}
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
		app.greet();
    }
}