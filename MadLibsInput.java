import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		intro();
		
		Scanner input = new Scanner(System.in);
		String adjective = getUserInput("Enter an adjective: ", input);
		String verb = getUserInput("Enter a verb: ", input);
		String noun = getUserInput("Enter a noun: ", input);
		String adverb = getUserInput("Enter an adverb: ", input);

		printMadLib(adjective, verb, noun, adverb);
	}

	public static void intro() {
		System.out.println("Welcome to Mad Libs!");
	}

	public static String getUserInput(String message, Scanner in){
		System.out.print(message);
		return in.nextLine();
	}

	public static void printMadLib(String adj, String verb, String noun, String adverb) {
		System.out.println("\nOnce upon a time a " + adj + " " + noun + " who liked to " + verb + " wanted to be "+ adj + "er.\n"
				+ "So they went to "+ adj + " class and learned about "+ adj + " " + noun + "s. \n"
				+ "Then the " + noun + " could " + verb + " more " + adverb + " than anything in the world. \nFIN" );
	}

}
