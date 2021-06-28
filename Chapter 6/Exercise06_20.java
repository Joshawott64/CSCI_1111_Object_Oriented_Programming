/*
 * Josh Gray
 * 6/28/21
 * This program tells the user how many letters are contained in a string.
 */
import java.util.Scanner;
public class Exercise06_20 {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		// Prompt user
		System.out.print("Enter a string: ");
		String response = input.nextLine();
		// Output string length
		int length = response.length();
		System.out.println("'" + response + "' " + "is " + length + " characters long");
		// Invoke countLetters method
		int letters = countLetters(response);
		System.out.println("There are " + letters + " letters in '" + response + "'");

	}
	/** Counts the characters and letters in a string */
	public static int countLetters(String s) {
		int length = s.length();
		int totalLetters = 0;
		for (int i = 0; i < length; i++) {
			if (Character.isLetter(s.charAt(i)) == true) {
				totalLetters++;
			}
		}
		return totalLetters;
	}

}
