/*
 * Author: Joshua Gray
 * Date: 7/19/21
 * 
 * This program implements the MyInteger class to run an 
 * integer value through various tests such as testing if 
 * it is odd or even.
 */
public class Exercise10_03 {

	public static void main(String[] args) {
		// Create objects
		MyInteger integer1 = new MyInteger(11);
		MyInteger integer2 = new MyInteger(50);
		
		// Test isEven(), isOdd(), and isPrime() methods
		System.out.println("isEven() = " + integer1.isEven() + " for " + integer1.value);
		System.out.println("isEven() = " + integer2.isEven() + " for " + integer2.value);
		System.out.println();
		System.out.println("isOdd() = " + integer1.isOdd() + " for " + integer1.value);
		System.out.println("isOdd() = " + integer2.isOdd() + " for " + integer2.value);
		System.out.println();
		System.out.println("isPrime() = " + integer1.isPrime() + " for " + integer1.value);
		System.out.println("isPrime() = " + integer2.isPrime() + " for " + integer2.value);
		System.out.println();
		
		// Test isEven(int), isOdd(int), and isPrime(int) methods
		System.out.println("isEven(int) " + MyInteger.isEven(integer1.value) + " for " + integer1.value);
		System.out.println("isEven(int) " + MyInteger.isEven(integer2.value) + " for " + integer2.value);
		System.out.println();
		System.out.println("isOdd(int) " + MyInteger.isOdd(integer1.value) + " for " + integer1.value);
		System.out.println("isOdd(int) " + MyInteger.isOdd(integer2.value) + " for " + integer2.value);
		System.out.println();
		System.out.println("isPrime(int) " + MyInteger.isPrime(integer1.value) + " for " + integer1.value);
		System.out.println("isPrime(int) " + MyInteger.isPrime(integer2.value) + " for " + integer2.value);
		System.out.println();
		
		// Test isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)
		System.out.println("isEven(MyInteger) = " + MyInteger.isEven(integer1) + " for " + integer1.value);
		System.out.println("isEven(MyInteger) = " + MyInteger.isEven(integer2) + " for " + integer2.value);
		System.out.println();
		System.out.println("isOdd(MyInteger) = " + MyInteger.isOdd(integer1) + " for " + integer1.value);
		System.out.println("isOdd(MyInteger) = " + MyInteger.isOdd(integer2) + " for " + integer2.value);
		System.out.println();
		System.out.println("isPrime(MyInteger) = " + MyInteger.isPrime(integer1) + " for " + integer1.value);
		System.out.println("isPrime(MyInteger) = " + MyInteger.isPrime(integer2) + " for " + integer2.value);
		System.out.println();
		
		// Test equals(int) and equals(MyInteger)
		System.out.println("equals(int) = " + integer1.equals(integer1.value) + " for " + integer1.value);
		System.out.println("equals(int) = " + integer2.equals(integer2.value) + " for " + integer2.value);
		System.out.println();
		System.out.println("equals(MyInteger) = " + integer1.equals(integer1) + " for " + integer1.value);
		System.out.println("equals(MyInteger) = " + integer2.equals(integer2) + " for " + integer2.value);
		System.out.println();
		
		// Test parseInt(char[]) and parseInt(String) methods
		char[] charArray1 = new char[2];
		charArray1[0] = '1';
		charArray1[1] = '1';
		
		char[] charArray2 = new char[2];
		charArray2[0] = '5';
		charArray2[1] = '0';
		
		System.out.println(MyInteger.parseInt(charArray1));
		System.out.println(MyInteger.parseInt(charArray2));
		System.out.println();
		
		String stringNumber1 = "11";
		String stringNumber2 = "50";
		
		System.out.println(MyInteger.parseInt(stringNumber1));
		System.out.println(MyInteger.parseInt(stringNumber2));

	}

}
class MyInteger {
	
	// Data field
	int value;
	
	// Construct with specified value
	MyInteger(int newValue) {
		value = newValue;
	}
	
	// Return value (getter)
	public int GetMyInteger() {
		return value;
	}
	
	// Return true if value in object is even
	public boolean isEven() {
		return isEven(value);
	}
	
	// Return true if value in object is odd
	public boolean isOdd() {
		return isOdd(value);
	}
	
	// Return true if value in object is prime
	public boolean isPrime() {
		return isPrime(value);
	}
	
	// Return true if specified value is even
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Return true if specified value is odd
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Return true if specified value is prime
	public static boolean isPrime(int value) {
		if (value <= 1) {
			return false;
		}
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Return true if specified value is even
	public static boolean isEven(MyInteger mI) {
		return isEven(mI.value);
	}
	

	// Return true if specified value is odd
	public static boolean isOdd(MyInteger mI) {
		return isOdd(mI.value);
	}
	
	// Return true if specified value is prime
	public static boolean isPrime(MyInteger mI) {
		return isPrime(mI.value);
	}
	
	// Return true if value in object is equal to specified value
	public boolean equals(int mI) {
		if (mI == value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Return true if value in object is equal to specified value
	public boolean equals(MyInteger mI) {
		return equals(mI.value);
	}
	
	// Convert array of numeric characters to int value
	public static int parseInt(char[] array) {
		int number = Integer.parseInt(String.valueOf(array));
		return number;
	}
	
	// Convert string to int value
	public static int parseInt(String value) {
		int number = Integer.valueOf(value);
		return number;
	}
}
