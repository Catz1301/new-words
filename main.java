import java.util.*;
import java.lang.*;

public class main {
	
	public static void main(String[] args) {
		
		Scanner wrds = new Scanner(System.in); // Initialize an instance of Scanner
		Random rnd = new Random((System.currentTimeMillis()/1000L)); // Initialize a new instance of Random with a seed based on unix epoch time to help aide the psuedo random number generator problem
		System.out.println("This is a word generator!");
		System.out.println("How long should the word be?");
		int wordLen = wrds.nextInt(); // Get user input for length of word
		wordLen -= 1;
		
		// Set information
		String consonant = "bcdfghjklmnpqrstvwxyz";
		String vowel = "aeiou";
		
		
		for (int i = 0; i < wordlen; i++) {
			if (i % 2 == 1) {
				char result = consonant.charAt(rnd.nextInt(consonant.length()));
				System.out.print(result);
			}
			else if (i % 2 == 0) {
				char result = vowel.charAt(rnd.nextInt(vowel.length()));
				System.out.println();
			}
			else {
				System.out.println("Oops, something went wrong! You should fill out an issue at \u001B[1m https://github.com/Catz1301/new-words/issues");
			}
		}
	}
}
