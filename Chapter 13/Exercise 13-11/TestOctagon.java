/*
 * Author: Joshua Gray
 * Date: 8/3/21
 * 
 * This program creates an octagon object, clones it 
 * into second, and uses the .compareTo method to 
 * compare the two objects.
 */
public class TestOctagon implements Cloneable {

	public static void main(String[] args) {
		// Construct octagon object
		Octagon octagon1 = new Octagon(5, "blue", false);
		
		// Clone octagon1
		Octagon octagon2 = octagon1.clone();
		System.out.println(octagon2.getArea());
		
		// Compare areas
		int i = octagon1.compareTo(octagon2);
		if (i == 0) {
			System.out.println("octagon1 and octagon2 have the same area");
			}
			else {
				System.out.println("octagon1 and octagon2 have different areas");
			}
	}

}
