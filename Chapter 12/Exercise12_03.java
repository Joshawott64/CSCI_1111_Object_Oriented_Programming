/*
 * Author: Joshua Gray
 * Date: 7/30/21
 * 
 * This program generates an array with 100 random integers. The program 
 * prompts the user to enter an integer to represent an index in the 
 * array. If the array index entered is out of bounds, the program 
 * will display 'Out of Bounds,' otherwise it returns the array 
 * element at the specified index.
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Exercise12_03 {
	// Returns element at specified index
		public static int element(int number, int[] array) {
			return array[number];
		}

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Generate array
		int[] randomArray = new int[100];
		for (int i = 0; i < randomArray.length; i++) {
			int randomInt = ThreadLocalRandom.current().nextInt();
			randomArray[i] = randomInt;
		}
		
		// Prompt user
		System.out.print("Enter an array index: ");
		int index = input.nextInt();
		
		try {
			System.out.println(element(index, randomArray));
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception: entered index is out of bounds");
		}
		

	}

}
