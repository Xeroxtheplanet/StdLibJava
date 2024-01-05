package practicePackage._01_introduction.attempts;

public class Stage2 {


	/**
	 * 
	 * @param n (n could be positive, negative or zero)
	 * @return the last digit of the number
	 * For example,
	 * lastDigit(15) = 5
	 * lastDigit(-15) = 5
	 * lastDigit(0) = 0
	 * lastDigit(8) = 8
	 */
	public static int lastDigit(int n) {
		if (n<0) {
			n= n*-1;
		}
		return n%10;
	}

	/**
	 * 
	 * @param n
	 * @return the absolute value for n.
	 * absolute value is defined as the number without the negative sign, if any
	 * For example, absolute(-6) = 6, absolute(9) = 9
	 */
	public static int absolute(int n) {
		if (n<0) {
			n= n*-1;
		}
		return n; //to be completed
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return the quadrant in which coordinate (x, y) exists
	 * quadrant 1: non-negative x, non-negative y
	 * quadrant 2: negative x, non-negative y
	 * quadrant 3: negative x, negative y
	 * quadrant 4: non-negative x, negative y
	 * 
	 */
	public static int getQuadrant(int x, int y) {
		if ((x>=0)&&(y>=0)) {
			return 1;
		}
		if ((x<0)&&(y>0)) {
			return 2;
		}
		if ((x<0)&&(y<0)) {
			return 3;
		}
		if ((x>0)&&(y<0)) {
			return 4;
		}
		return 0; //to be completed
	}

	/**
	 * @param val (assume val is more than or equal to zero)
	 * @return floor of val
	 * floor of a floating-point value is defined as the highest integer
	 * that is less than or equal to the value.
	 * For example, floor(4.2) = 4, floor(7.0) = 7, floor(5.9999) = 5
	 */
	public static int floor(double val) {
		return (int) (val); //cast val to integer
	}

	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the last character in the String
	 */
	public static char getLastChar(String str) {
		return str.charAt(str.length()-1); //'a' used as default value (to be completed)
	}

	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the String with the last character removed
	 */
	public static String getWithoutLastChar(String str) {
		str = str.substring(0, str.length()-1);
		return str;
		
	}
}