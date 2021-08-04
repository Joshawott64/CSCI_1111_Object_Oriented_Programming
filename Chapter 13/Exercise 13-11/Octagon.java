
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
	// Data field
	private Double sideLength;
	
	// Default constructor
	public Octagon() {
	}
	
	public Octagon(double sideLength) {
		this.sideLength = sideLength;
	}
	
	// Construct octagon with specified values
	public Octagon(double sideLength, String color, boolean filled) {
		this.sideLength = sideLength;
		setColor(color);
		setFilled(filled);
	}
	
	// Returns side length
	public double getSideLength() {
		return sideLength;
	}
	
	// Returns area of octagon
	@Override
	public double getArea() {
		return ((2 + (4 / Math.sqrt(2))) * sideLength * sideLength);
	}

	// Returns perimeter of octagon
	@Override
	public double getPerimeter() {
		return sideLength * 8;
	}
	
	// Implements Cloneable
	@Override
	public Octagon clone() {
		try {
			// Shallow copy
			Octagon octagonClone = new Octagon(this.sideLength);
			// Deep copy
			octagonClone.sideLength = (double)(this.getSideLength());
			return octagonClone;
		}
		catch (Exception ex) {
			return null;
		}
	}
	
	// Implements Comparable
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) {
			return 1;
		}
		else if (getArea() < o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
