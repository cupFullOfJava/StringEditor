import java.util.Scanner;

/**
 * A program which takes a string given by the user and outputs only the uppercase letters,
 * every second letter, the text with every vowel replaced by an underscore,
 * and the number of vowels in the word.
 * @author jeremytimothybrown
 */
public class StringDriver {
	
	private static String input, upperString, everySecond, noVowels;
	private static int countVowels;

	/**
	 * Gets a string from the user.
	 * Outputs the string manipulations.
	 * @param args the command line arguments (Ignored).
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userIn = new Scanner(System.in);
		
		System.out.print("Input a string (no spaces): ");
		input = userIn.next();
		
		 MyString stringManipulator = new MyString(input);
		 upperString = stringManipulator.findUpper();
		 everySecond = stringManipulator.everySecond();
		 noVowels = stringManipulator.replaceVowels();
		 countVowels = stringManipulator.countVowels();
		 
		 System.out.print("\n"+"Part a)	"+upperString+"\n"+
				 "Part b)	"+everySecond+"\n"+
				 "Part c)	"+noVowels+"\n"+
				 "Part d)	"+countVowels);
		
		

	}

}
