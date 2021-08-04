/*
 * Author: Joshua Gray
 * Date: 8/2/21
 * 
 * This program runs similarly to Exercise 11-1 with the main 
 * difference being that GeometricObject is an abstract method.
 */
import java.util.Scanner;
public class TestTriangle {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for side lengths
		System.out.print("Enter 3 side lengths separated by a space: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Prompt user for color
		System.out.print("Enter a color: ");
		String color = input.next();
		
		// Prompt user for filled
		System.out.print("Enter 'true' or 'false' to determine "
				+ "if shape is filled or not: ");
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		System.out.println("A triangle " + triangle.toString());
		System.out.println("The color is " + triangle.getColor());
		System.out.println("The perimeter is " 
		+ triangle.getPerimeter());
		System.out.println("The area is " 
				+ triangle.getArea());
		

	}

}
