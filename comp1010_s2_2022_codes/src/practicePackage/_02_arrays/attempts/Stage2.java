package practicePackage._02_arrays.attempts;

public class Stage2 {


	/**
	 * 
	 * @param data
	 * @return the sum of all even items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumEven(int[] data) {
		if(data == null) {
		return 0; //to be completed}
		}
		int sum = 0;
		for(int i = 0; i < data.length;i++) {
			if (data[i]%2==0) {
				sum += data[i];
			}
			else sum+=0;
		}
		return sum;
	}

	/**
	 * 
	 * @param data
	 * @return the sum of all positive (more than 0) items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumPositives(int[] data) {
		if (data == null) {
		return 0; //to be completed
		}
		int sum = 0;
		for (int i = 0; i<data.length; i++) {
			if (data[i]>0) {
				sum+=data[i];
			}
			else sum+=0;
		}
		return sum;
	}

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the sum of all items of the array passed that are multiples of n.
	 * return 0 if the array is null
	 */
	public static int sumMultiples(int[] data, int n) {
		if (data ==null) {
		return 0; //to be completed
		}
		int sum =0;
		for (int i =0; i<data.length;i++) {
			if (data[i]%n==0) {
				sum+=data[i];
			}
			else sum+=0;
		}
		return sum;
	}

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return sum of all items of the array passed that lie in the number range [low...high]
	 */
	public static int sumInRange(int[] data, int low, int high) {
		if((data == null)) {
		return 0; //to be completed
		}
		int sum =0;
		for (int i=0; i<data.length;i++) {
			if ((data[i]<low)||(data[i]>high)) {
				sum+=0;
			}
			else
			sum+=data[i];
		}
		return sum;
	}

	/**
	 * 
	 * @param data
	 * @return the sum of all items at even indices of the array passed
	 */
	public static int sumEvenIndexedItems(int[] data) {
		if (data == null) {
			return 0;
		}
		int sum =0;
		for (int i = 0; i<data.length;i++) {
			if(i%2==0) {
				sum+=data[i];
			}
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param data
	 * reset any negative value(s) in the array passed to zero.
	 */
	public static void resetNegatives(int[] data) {
		if (data==null) {
			System.out.println("D");
		}
		else
		for (int i = 0; i<data.length; i++) {
			if(data[i]<0) {
				data[i] =0;
			}
		}
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * update each item of the array to the square of itself.
	 */
	public static void squareUp(int[] data) {
		if (data == null) {
			System.out.println("");
		}
		else
			for(int i = 0; i< data.length; i++) {
				data[i] = data[i]*data[i];
			}
	}

	/**
	 * 
	 * @param data
	 * @return the number of odd numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countOdd(int[] data) {
		int sum = 0;
		if (data == null) {
			return 0;
		}
		else
		for (int i = 0; i<data.length; i++) {
			if (data[i]%2 != 0) { // if odd
				sum+=1;
			}
		} //to be completed
		return sum;
	}

	/**
	 * 
	 * @param data
	 * @return the number of negative (less than 0) numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countNegatives(int[] data) {
		if (data == null) {
			return 0;
		}
		int sum = 0;
		for (int i =0;i<data.length; i++) {
			if (data[i]<0) {
				sum+=1;
			}
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the number of items in the array passed of which n is a multiple.
	 * return 0 if the array is null.
	 */
	public static int countFactors(int[] data, int n) {
		if (data == null) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i <data.length; i++) {
			if (n%data[i]==0) {
				sum+=1;
			}
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return number of items in the array passed that are OUTSIDE the number range [low...high].
	 * return 0 if the array is null.
	 */
	public static int countNotInRange(int[] data, int low, int high) {
		if (data == null) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i<data.length; i++) {
			if((data[i]<low)||(data[i]>high)) {
				sum+=1;
			}
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the number of items in the array passed that occur exactly once in the array.
	 * return 0 if array is null.
	 * HINT: use countOccurrences(int[], int)
	 */
	public static int countUnique(int[] data) {
		if (data == null) {
			return 0;
			}
		boolean timeSyncer = false; // To ensure if one loop is longer than the other that both loops break if a non-unique value is found in either
		int OneinCheck = 0; //If a value in the checkarray is found to be 1 this is updated
		int checkarray[] = new int[data.length]; // the array to store whether a value at an index is unique
		for (int p = 0; p<checkarray.length; p++) { // fill checkarray with 0s
			checkarray[p]=0;
		}
		if (data.length == 1) { // one unique item
			return 1;
		}
		for (int i = 0; i<data.length; i++) { // go through the array upwards from i
			for (int n=i+1; n<data.length; n++){
				if ((data[n]!=data[i])&&(timeSyncer==false)) {
					checkarray[i]=1; //set it to 1 continuously it does not break until it is proven not unique
				}
				else if ((data[n]==data[i])||(timeSyncer == true)) {
					checkarray[i]=0;
					timeSyncer = true; //Engage the timeSyncer so the other loop no longer progresses
					break; //we have confirmed that it is not unique so break the loop for the final result
				}
			}
			if(i>0) { //Can't go down if there's nothing to go down from
				for (int k=i-1; k>-1; k--) {
					if((data[k]!=data[i])&&(timeSyncer==false)) {
					checkarray[i]=1;
					}
					else if((data[k]==data[i])||(timeSyncer ==true)) {
					checkarray[i]=0;
					timeSyncer = true;
					break; //we have confirmed that it is not unique so break the loop
					}
				}
			}
			timeSyncer = false; // Prepare time syncer for the next part of the array
		}
		for (int c = 0; c<checkarray.length; c++) {
			if (checkarray[c] == 1) {
				OneinCheck+=1;
			}
		}
		return OneinCheck;
		}
		


	/**
	 * 
	 * @param data
	 * @param target
	 * @return the first index at which target exists in the array passed.
	 * return -1 if array is null or target doesn't exist in the array.
	 */
	public static int indexOf(int[] data, int target) {
		int index = 0;
		try {
			if ((data == null)||(data.length ==0)) {
				index = -1;
			}
			} catch (NullPointerException npe) {
				System.out.println("Error here");
				return -1;
				
			}
		if (data == null) {
			return -1;
		}
		else
		for (int i = 0; i< data.length; i++) {
			if (data[i]==target) {
				index = i;
				break;
			}
			else index = -1;
		}
		return index; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @param startIndex
	 * @return true if target exists at index startIndex or later in the array passed, false otherwise.
	 * return false if array is null or target doesn't exist in the array starting at index startIndex.
	 */
	public static boolean containsFromIndex(int[] data, int target, int startIndex) { // I STILL GOT IT BABY, BIT like maths requires work each day
		
		if((data==null)||(startIndex<0)||(startIndex>=data.length)||(data.length==0)) {
			return false;
		}
		
		for(int i = startIndex; i<data.length; i++) {
			if((data[i] == target)&&(i>=startIndex)) {
				return true;
			}
			
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @param startIndex
	 * @param endIndex
	 * @return true if target exists in the index range [startIndex...endIndex] at which target exists in the array passed, false otherwise.
	 * return false if array is null or target doesn't exist in the array in the index range [startIndex...endIndex].

	 */
	public static boolean containsBetweenIndices(int[] data, int target, int startIndex, int endIndex) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param endIndex
	 * @return sum of all items at index endIndex or lower in the array passed.
	 * return 0 if array is null.
	 */
	public static int sumUptoIndex(int[] data, int endIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param startIndex
	 * @return sum of all even numbers at index startIndex or later.
	 * return 0 if array is null.
	 */
	public static int sumEvenFromIndex(int[] data, int startIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param endIndex
	 * @return product of all positive items up to index endIndex.
	 * return 1 if array is null or if no positive items exist up to index endIndex.
	 */
	public static int productPositivesUptoIndex(int[] data, int endIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param key
	 * @param startIndex
	 * @param endIndex
	 * @return number of times key exists in the array between the indices startIndex and endIndex.
	 * return 0 if array is null or if key doesn't exist between indices startIndex and endIndex. 
	 */
	public static int countOccurrencesBetweenIndices(int[] data, int key, int startIndex, int endIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are positive (more than 0), false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allPositives(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are zero, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allZeroes(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are prime, false otherwise.
	 * You can use the method isPrime from class MathService.
	 * To check if an integer (val) is prime, use the expression MathService.isPrime(val) == true
	 * return false if the array is null.
	 */
	public static boolean allPrimes(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one negative (less than 0) value in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsNegative(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one non-zero in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsNonZero(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if the array is in ascending order, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean isAscending(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are the same, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean isUnchanged(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if the array contains the same number of positive (more than 0) and negative (less than 0) items.
	 * return false if array is null.
	 */
	public static boolean isBalanced(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if at least 1 item of the array is a valid digit ('0' to '9'), false otherwise.
	 * return false if array is null.
	 */
	public static boolean containsDigit(char[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return a copy of the array.
	 * NOTE: the array returned SHOULD NOT refer to the same collection
	 * that the array passed refers to. 
	 * In other words
	 * if you update the values in the array returned, 
	 * the values in the array passed should not change. 
	 */
	public static int[] getCopy(int[] data) { //Basically, do not set a pointer to the array, create a new array and assign a pointer to that.
		
		if(data==null) {
			return null;
		}
		if(data.length ==0) {
			return new int[0];
		}
		
		
		int[] newArr = new int[data.length];
		for(int i = 0; i<newArr.length; i++) {
			newArr[i] = data[i];
		}
		return newArr;
	}
}