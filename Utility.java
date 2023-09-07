public class Utility {
    static void printHelloWorld(String input){
	if (input.equals("hello")){
		System.out.println("Hello World!");
	}
	else if (input.equals("goodbye")){
		System.out.println("Goodbye, cruel world!");
	}
	else {
		System.out.println("Expected 'hello' or 'goodbye'");
	}
    }
}
