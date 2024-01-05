package practicePackage._01_introduction.attempts;

public class Stage4 {


	/**
	 * 
	 * @param data: assume it's not null
	 * @param target
	 * @return the LAST index at which target exists in data, -1 if it doesn't exist
	 */
	public static int lastIndexOf(int[] data, int target) {
		int count = 0;
		int lastplace=0;
		for (int i = 0; i<data.length;i++) {
			if(data[i] == target) {
				count++;
				lastplace = i;
			
			}
		}
		if(count == 0) {
			return -1;
		}
		return lastplace; //to be completed
	}

	/**
	 * @param a
	 * @param b
	 * @return the highest integer that divides both a and b.
	 * for example, 
	 * gcd(70, 40) = 10
	 * gcd(-70, 40) = 10
	 * gcd(15, 32) = 1
	 * gcd(-51, 153) = 51
	 */
	public static int gcd(int a, int b) {
		int hcf = 0;
		for (int i = 1; i<=a||i<=b;i++) { //goes from i to max of a and b. End result will always be highest value.
			if(a%i == 0 && b%i == 0) { // checks if number is equal
				hcf = i; // will automatically go to highest possible value anyway
			}
		}
			
	
		return hcf; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return true if n is a perfect square (square of an integer), false otherwise
	 */
	public static boolean isSquare(int n) {
		int numtosquare = 0;
		for (int i = 0; i<= n; i++) {
			if(numtosquare*numtosquare!= n) {
				numtosquare+=1;
			}
			else if (numtosquare*numtosquare==n) {
				return true;
					
			}
		}
		return false;
	}

	/**
	 * 
	 * @param val (val could be positive or zero or negative)
	 * @return val rounded to the nearest integer.
	 */
	public static int roundOffAdvanced(double val) {
		int valsfloor = (int) val;
		if (val - (double) valsfloor >= 0.5) {
			return (int) (val +0.5); 
		}
		if (val + (double) valsfloor <= -0.5) {
			return (int) (val -0.5); 
		}
		if (val - (double) valsfloor < 0.5) {
			return valsfloor;
		}
		if (val + (double) valsfloor > 0.5) {
			return valsfloor;
		}
		return 0;		
	}

	/**
	 * 
	 * @param val (val can be positive or zero or negative)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public static int ceilingAdvanced(double val) {
		if(val >=0) { //if positive
			if(val == (int) val) {
				return (int) val;
			}
			return (int) (val+1);
		}
		if (val <0) { // if negative
			return (int) val;
		}
		return 0; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return true if every character in str is a digit ('0' to '9'), false otherwise.
	 * also, return false if str is empty.
	 */
	public static boolean isNumeric(String str) {
		int counter = 0; //amount of positives to be added
		if (str == null) { //if there is nothing return false
			return false;
		}
		try { //try catch method is account for the error
			Double.parseDouble(str); // accounts for large numbers 
		} catch (NumberFormatException nfe) { //returns false if the exception is caught
				System.out.println("Error");
				return false;
			}
		for (int i = 0; i<str.length(); i++) {
			Double.parseDouble(str); //str to double
			counter++;
			if (counter>1) { //return true if found to be positive. Probably should be to the length of the string but it works
				return true;
			}
		}
		
		return true; //so it returns something
	}

	/**
	 * 
	 * @param str
	 * @return the reverse of the String passed
	 */
	public static String reverse(String str) {
		char[] yr = str.toCharArray(); //splits the string into an array of characters.
		String newstring = ""; // the new string to store the result
		for (int i = yr.length-1; i>= 0;i--) { //chars applied in reverse
			newstring= newstring + yr[i]; //chars are applied to the new string in reverse
		}
		return newstring; //return the end result
	}

	/**
	 * 
	 * @param n
	 * @return true if the passed integer is a concatenation of two
	 * squares. For example, if n = 164, return true since it's a 
	 * concatenation of 1 and 64, both of which are squares. 
	 * If n = 86, return false.
	 * If n = 25, return false, since although the number itself
	 * is a square, it cannot be split along a line into two integers,
	 * each of which is a square.
	 */
	public static boolean isConcatTwoSquares(int n) {
		int sumcheck1 = 0; //checks first half has been accepted as a square
		int sumcheck2 = 0; //checks second half has been accepted as a square
		int digitcompare = 0;
		String acceptedintegers1 = ""; //declare the numbers we will use for the first half of the number
		String acceptedintegers2 = ""; //declare the numbers we will use for the second half of the number
		String castedinteger = String.valueOf(n); //convert n to string
		char[] castedintegerarray = castedinteger.toCharArray(); //convert string to a char array
		//first half
		if (castedintegerarray.length%2!=0) { //if length is odd
			for (int i = 0; i<castedintegerarray.length/2; i++) { //grab the second half of the integers in the array and assign them to acceptedintegers2
				 acceptedintegers1 = acceptedintegers1+ castedintegerarray[i];//concatenates string with each new number
				}
			System.out.println("this one"); //this works
			System.out.println(acceptedintegers1);
			
		}
		else
			if (castedintegerarray.length%2==0) { //if length is even
				for (int i = 0; i<=castedintegerarray.length/2-2; i++) { //grab the first half of the integers in the array and assign them to acceptedintegers1
					acceptedintegers1 = acceptedintegers1+ castedintegerarray[i];//concatenates string with each new number
			 
				}
				System.out.println("Second one");
				System.out.println(acceptedintegers1);
			}
		if (acceptedintegers1 != null) { //if the string isn't empty
			int acceptedintegers1asint = Integer.parseInt(acceptedintegers1); //parse the string to an integer for calcs
			if(isSquare(acceptedintegers1asint)==true) { //don't know if I'm allowed to do this but calls my isSquare func to find if the integer is a square
				sumcheck1++;
			}
			else
			sumcheck1 = 0; //this works
		}
		//second half (dependent on odd or even length)
		if(castedintegerarray.length%2!=0) { //if length is odd
			for (int i = castedintegerarray.length/2; i<castedintegerarray.length; i++) { //grab the second half of the integers in the array and assign them to acceptedintegers2
			 acceptedintegers2 = acceptedintegers2+ castedintegerarray[i];//concatenates string with each new number
			}
			System.out.println("this one too"); //this works
			System.out.println(acceptedintegers2);
		}
		else if (castedintegerarray.length%2 == 0) { //if length is even
			for (int i = castedintegerarray.length/2-1; i<castedintegerarray.length; i++) { //grab the second half of the integers in the array and assign them to acceptedintegers2
				 acceptedintegers2 = acceptedintegers2+ castedintegerarray[i];//concatenates string with each new number
			}
		}
		System.out.println("Second one too");
		System.out.println(acceptedintegers2);
		if (acceptedintegers2 != null) { //if the string isn't empty
			int acceptedintegers2asint = Integer.parseInt(acceptedintegers2); //parse the string to an integer for calcs
			if(isSquare(acceptedintegers2asint)==true) { //don't know if I'm allowed to do this but calls my isSquare func to find if the integer is a square
				sumcheck2++;
			}
			else sumcheck2 =0; //this works
		}
		if(sumcheck1 + sumcheck2 == 2) { //if both are squares then return true
			return true;
		}
		else 
		System.out.println(sumcheck1); //error checking prints
		System.out.println(sumcheck2);
		
		return false; //otherwise it is not a concatenation of 2 squares
	}
		
		

	}
		