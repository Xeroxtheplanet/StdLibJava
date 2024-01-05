package practicePackage._01_introduction.attempts;

public class Stage3 {


	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive EVEN integers (2+4+...+(2*n))
	 */
	public static int sumEvenV1(int n) {
		int sum = 0;
		for (int i = 2; i<= 2*n; i+=2) { //
			
			 sum += i;
		}
		return sum; //to be completed 
	}

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of all positive even integers up to, and including n  
	 * either (2+4+...+n) or (2+4+...+(n-1))
	 */
	public static int sumEvenV2(int n) {
		int sum = 0;
		for (int i = 2 ; i<=n || i<=(n-1); i+=2) {
			sum += i;
		}
		return sum; //to be completed	
	}

	/**
	 * 
	 * @param n
	 * @return the product of the first n positive integers.
	 * for example, if n = 5, return 1*2*3*4*5 = 120
	 * return 1 if n < 1
	 */
	public static int product(int n) {
		int prod = 1;
		if (n<1) {
			return 1;
		}
		for (int i =1; i<=n; i++) {
			prod *= i;
		}
		return prod; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return the productOdd of the first n odd positive integers.
	 * for example, if n = 5, return 1*3*5*7*9 = 945
	 * return 1 if n < 1
	 */
	public static int productOdd(int n) {
		int oddprod = 1;
		int counter = n; // treats n as instance of update
		if (n<1) {
			return 1;
		}
		for (int i = 1;i<=counter;i+=2) {
			oddprod *= i;
			counter++; //so counter is updated n times and stops after the limit is reached
		}
		return oddprod; //to be completed
	}

	/**
	 * 
	 * @param x
	 * @param n (assume n is more than or equal to 0)
	 * @return x to the power of n without using Math library
	 */
	public static int power(int x, int n) {
		int pow = n;
		int initial = x;
		int value = 1;
		if (n == 0) {
			return 1;
		}
		while (pow >0) {
			value = value *initial;
			pow--;
					
		}
		return value;
	}

	/**
	 * 
	 * @param data: assume it's not null
	 * @return the sum of all even numbers in data
	 */
	public static int sumEven(int[] data) {
		int sum = 0;
		for (int i = 0; i<data.length; i++) {
			if (data[i]%2 == 0) {
				sum += data[i];
			}
			else sum +=0;
		}
		return sum; //to be completed

	}
}