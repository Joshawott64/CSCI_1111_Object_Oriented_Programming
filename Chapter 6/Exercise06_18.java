/*
 * Author: Joshua Gray
 * Date: 6/28/21
 * 
 * This program validates a user's password 
 * based on three conditions.
 */
import java.util.Scanner;
public class Exercise06_18 {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		// Prompt user
		System.out.print("Enter a valid password: ");
		String password = input.nextLine();
		// Verify password
		boolean verify = isValid(password);
		if (verify == true) {
			System.out.println("Valid Password");
		}
		else if (verify == false) {
			System.out.println("Invalid Password");
		}

	}
	/** Verifies the validity of password */
	public static boolean isValid(String s) {
		boolean length = false;
		boolean characters = false;
		boolean digits = false;
		//Check length
		if (s.length() >= 8) {
			length = true;
		}
		// Check characters and digits
		int totalDigits = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i)) == true) {
				characters = true;
			}
			else if (Character.isLetterOrDigit(s.charAt(i)) == false) {
				characters = false;
			}
			if (Character.isDigit(s.charAt(i)) == true) {
				totalDigits++;
			}
		}
		if (totalDigits >= 2) {
			digits = true;
		}
		// Test all conditions
		if ((length == true) && (characters == true) && (digits == true)) {
			return true;
		}
		else {
			return false;
		}
	}

}
