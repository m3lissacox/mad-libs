
public class MadLibs {

	public static void main(String[] args) {
		intro(); 										//method with no args
		printMadLib1("fast");							//method with 1 arg
		printMadLib2("fast", "run", "runner");			//method with many args
		
		//create your own Mad Libs by following the format:
		//printMadLib2("adjective", "verb, "noun");
		printMadLib2("1337", "dab on the haters", "Fortnite streamer");

	}
	
	public static void intro() {
		System.out.println("Welcome to Mad Libs!");
	}
	public static void printMadLib1(String adj) {
		System.out.println("Once upon a time a " + adj + " person wanted to be "+ adj + "er.\n"
				+ "So they went to "+ adj + " class and learned about "+ adj + " things. \nFIN" );
	}
	public static void printMadLib2(String adj, String verb, String noun) {
		System.out.println("Once upon a time a " + adj + " " + noun + " who liked to " + verb + " wanted to be "+ adj + "er.\n"
				+ "So they went to "+ adj + " class and learned about "+ adj + " " + noun + "s. \n"
						+ "Then the " + noun + " could " + verb + " " + adj + "er than anything in the world. \nFIN" );
	}

}
