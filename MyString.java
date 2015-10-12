/**
 * This program manipulates strings that the user inputs.
 * @author jeremytimothybrown
 *
 */
public class MyString {
	
	private static String text;
	private static int j;
	
	/**
	 * Constructor method which gets the text needed.
	 * @param s the text given by the user
	 */
	public MyString(String s){
		text = s;
	}
	
	/**
	 * Returns the text.
	 * @return text the String given by the user
	 */
	public String getText(){
		return text;
	}
	
	/**
	 * Finds and returns all uppercase letters in the String.
	 * @return upperText uppercase letters in the text
	 */
	public String findUpper(){
		String upperText = "";
		
		for (int i = 0; i <text.length(); i++){
			char c = text.charAt(i);
			upperText += Character.isUpperCase(c) ? c:"";
		}
		return upperText;
	}
	
	/**
	 * Finds and returns every second letter in the String.
	 * @return everySec every second letter
	 */
	public String everySecond(){
		String everySec = "";
		
		for (int i = 0; i <text.length(); i++){
			if(i != 0 && i%2 != 0){
				char c = text.charAt(i);
				everySec += c;
			}
		}
		
		return everySec;
	}
	
	/**
	 * Finds and replaces every vowel in the String with an underscore.
	 * @return noVow the String without any vowels
	 */
	public String replaceVowels(){
		String noVow = "";
		for (int i = 0; i <text.length(); i++){
			char c = text.charAt(i);
			boolean ans = isVowel(c);
			if(ans){
				noVow += "_";
			}
			else{
				noVow += c;
			}
		}
		return noVow;
	}
	
	/**
	 * Finds and returns the number of vowels in the String.
	 * @return j the number of vowels
	 */
	public int countVowels(){
		for (int i = 0; i <text.length(); i++){
			char c = text.charAt(i);
			boolean ans = isVowel(c);
			if(ans){j ++;}
		}
		return j;
	}
	
	/**
	 * Retruns the text when called.
	 *@return the text 
	 */
	public String toString(){
		return text;
	}
	
	/**
	 * Tests if a letter is a vowel or not and returns the results.
	 * @param c the current letter being tested in the String
	 * @return if letter in String is a vowel
	 */
	public boolean isVowel(char c){
		
		char testC = c;
		
		if(testC=='a' || testC=='e' || testC=='i' || testC=='o' || testC=='u'){
			return true;
		}
		else if(testC=='A' || testC=='E' || testC=='I' || testC=='O' || testC=='U'){
			return true;
		}
		else{
			return false;
		}
	}
		
}
