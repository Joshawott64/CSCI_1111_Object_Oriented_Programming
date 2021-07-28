
public class Triangle extends GeometricObject {
	// Data fields
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// Default constructor
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Construct triangle with specified values
	public Triangle(double side1, double side2, double side3, 
			String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	
	// Return side1
	public double getSide1() {
		return side1;
	}
	
	// Return side2
	public double getSide2() {
		return side2;
	}
	
	// Return side3
	public double getSide3() {
		return side3;
	}
	
	// Returns area of triangle
	public double getArea(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	// Returns perimeter of triangle
	public double getPerimeter(double side1, double side2, double side3) {
		return side1 + side2 + side3;
	}
	
	// Returns string description of triangle
	public String toString(double side1, double side2, double side3) {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
