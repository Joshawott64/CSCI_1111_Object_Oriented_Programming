/*
 * Author: Joshua Gray
 * Date: 8/2/21
 * 
 * This program creates an array of five GeometricObjects, displays 
 * their areas, and invokes the howToColor method if it is colorable.
 */
import java.util.ArrayList;
public class TestTriangle {

	public static void main(String[] args) {
		// Create objects
		Triangle triangle1 = new Triangle(3, 5, 7, "blue", false);
		Triangle triangle2 = new Triangle(2, 4, 6, "yellow", true);
		Triangle triangle3 = new Triangle(7, 4, 6, "rainbow", false);
		Triangle triangle4 = new Triangle(3, 3, 3, "black", false);
		Triangle triangle5 = new Triangle(5, 5, 5, "green", true);
		
		// Create arraylist and store objects
		ArrayList<Triangle> triangleList = new ArrayList<>();
		
		triangleList.add(triangle1);
		triangleList.add(triangle2);
		triangleList.add(triangle3);
		triangleList.add(triangle4);
		triangleList.add(triangle5);
		
		// Display area and howToColor (if colorable)
		for (int i = 0; i < triangleList.size(); i++) {
			System.out.print("Triangle #" + (i + 1) + " has an area of " + (triangleList.get(i)).getArea());
			if (triangleList.get(i).isFilled() != true) {
				System.out.print(" (" + triangleList.get(i).howToColor() + ")");
			}
			System.out.println();
		}
		
	}

}