/*
 * Josh Gray
 * 6/28/21
 * This program prompts the user to input three side lengths 
 * for a triangle. If the input is valid, it will display the 
 * area of the triangle based on the three side lengths.
 */
import java.util.Scanner;
public class Exercise06_19 {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the 3 sides of the triangle: ");
		double sideOne = input.nextDouble();
		double sideTwo = input.nextDouble();
		double sideThree = input.nextDouble();
		// Run isValid method
		boolean valid = isValid(sideOne, sideTwo, sideThree);
		if (valid == true) {
			System.out.println("Side 1: " + sideOne);
			System.out.println("Side 2: " + sideTwo);
			System.out.println("Side 3: " + sideThree);
			System.out.printf("Area:   " + "%.1f", area(sideOne, sideTwo, sideThree));
		}
		else if (valid == false ) {
			System.out.println("That is not a valid triangle");
		}

	}
	/** Return true if the sum of every two sides is greater than the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		if (((side1 + side2) > side3) && ((side2 + side3) > side1) && 
				((side1 + side3) > side2)) {
			return true;
		} 
		else {
			return false;
		}
	}
	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

}
