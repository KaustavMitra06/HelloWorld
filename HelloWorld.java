public class HelloWorld {
public static void main(String[] args) {
	assert args.length == 1 : " Needs one parameter to run";
	Utility.printHelloWorld(args[0]);
	}
}