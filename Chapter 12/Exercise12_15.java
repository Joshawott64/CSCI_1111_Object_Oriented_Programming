/*
 * Author: Joshua Gray
 * Date: 7/30/21
 * 
 * This program creates a file named Exercise12_15.txt, writes 
 * 100 random integers into the file, and displays the data in 
 * increasing order.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Exercise12_15 {

	public static void main(String[] args) throws java.io.IOException {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		
		// Create file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		// Output to the file
		for (int i = 0; i < 100; i++) {
			int randomInt = ThreadLocalRandom.current().nextInt();
			output.print(randomInt + " ");
		}
		
		// Close the file
		output.close();
		
		// Create scanner for file
		Scanner input = new Scanner(file);
		
		// Read data from file
		int[] fileData = new int[100];
		while (input.hasNextInt()) {
			for (int i = 0; i < fileData.length; i++) {
				fileData[i] = input.nextInt();
			}
		}
		
		// Close the file
		input.close();
		
		// Sort fileData
		Arrays.sort(fileData);
		
		// Display sorted fileData
		for (int i = 0; i < fileData.length; i++) {
			System.out.print(fileData[i] + " ");
		}
		

	}

}
