/*
 * Author: Joshua Gray
 * Date: 6/25/21
 * 
 * This program outputs a table containing feet to 
 * meters and meters to feet conversions.
 */
public class Exercise06_09 {

	public static void main(String[] args) {
		System.out.println("Feet    Meters          Meters  Feet");
		System.out.println("-------------------------------------");
		double meters = 20;
		for (double feet = 1; feet <= 10; feet++) {
			System.out.printf(feet + "     " + "%.3f" + "           " + 
			meters + "    " + "%.3f", footToMeter(feet), meterToFoot(meters));
			System.out.println();
			meters = (meters + 5);
		}

	}
	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		double meter = (0.305 * foot);
		return meter;
	}
	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		double foot = (3.279 * meter);
		return foot;
	}

}
