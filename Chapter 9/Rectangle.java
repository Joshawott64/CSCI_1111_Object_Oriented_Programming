/*
 * Author: Joshua Gray
 * Date: 6/29/21
 * 
 * This program calculates the area and perimeter of two 
 * rectangles based on their width and height.
 */
public class Rectangle {

	public static void main(String[] args) {	
		
		// Construct rectangle with width of 4 and height of 40
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The area of a rectangle of width " + rectangle1.width +
				" and height " + rectangle1.height + " is " + rectangle1.getArea() +
				" and has a perimeter of " + rectangle1.getPerimeter());
		
		// Construct rectangle with width of 3.5 and height of 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The area of a rectangle of width " + rectangle2.width +
				" and height " + rectangle2.height + " is " + rectangle2.getArea() +
				" and has a perimeter of " + rectangle2.getPerimeter());
	}
	
		// Data fields
		double width;
		double height;
		
		// No-arg constructor
		Rectangle() {
			width = 1;
			height = 1;
		}
		
		// Construct rectangle with specified width and height
		Rectangle(double newWidth, double newHeight) {
			width = newWidth;
			height = newHeight;
		}
		
		// Return area of rectangle
		double getArea() {
			return width * height;
		}
		
		// Return perimeter of rectangle
		double getPerimeter() {
			return 2 * (width + height);
		}

}
