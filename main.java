import java.util.*;
import java.lang.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner wrds = new Scanner(System.in); // Initialize an instance of Scanner
		Random rnd = new Random((System.currentTimeMillis()/1000L)); // Initialize a new instance of Random with a seed based on unix epoch time to help aide the psuedo random number generator problem
		int wordLen = 0;
		int wordNum = 0;
		System.out.println("This is a word generator!");
		System.out.println("How long should the word be?");
		try {
			wordLen = wrds.nextInt(); // Get user input for length of word
		} catch (InputMismatchException ime) {
			System.out.println("You have entered an illegal value. Now defaulting to word Length of three.\nGood going, genius.");
			System.out.println("\n");
			wordLen = 3;
		}
		
		
		// Set information
		String consonant = "bcdfghjklmnpqrstvwxyz";
		String vowel = "aeiou";
		
		System.out.println("Do you want more than one word?");
		try {
			wordNum = wrds.nextInt(); // Get user input for length of word
		} catch (InputMismatchException ime) {
			System.out.println("You have entered an illegal value. Now defaulting to word Length of one.\nGood going, genius.");
			System.out.println("\n");
			wordNum = 1;
		}
		
		for (int j = 0; j < wordNum; j++) {
			for (int i = 0; i < wordLen; i++) {
				if (i % 2 == 1) {
					char result = consonant.charAt(rnd.nextInt(consonant.length()));
					System.out.print(result);
				}
				else if (i % 2 == 0) {
					char result = vowel.charAt(rnd.nextInt(vowel.length()));
					System.out.print(result);
				}
				else {
					System.out.println("Oops, something went wrong! You should fill out an issue at \u001B[1m https://github.com/Catz1301/new-words/issues");
				}
			}
			System.out.print(" ");
		}
	}
}
