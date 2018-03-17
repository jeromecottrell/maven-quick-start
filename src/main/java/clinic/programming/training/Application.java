package clinic.programming.training;
// note the package name versus the directory path namely /c/Users/jcottrel/projects/maven-quick-start/src/main/java/clinic/programming/training

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}