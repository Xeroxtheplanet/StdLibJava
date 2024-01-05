package practicePackage._02_arrays.attempts;

public class Stage3 { //By Lachlan Miller


	/**
	 * 
	 * @param data
	 * @return number of items that exist exactly once in the array passed
	 * 
	 */
	public static int countUniqueItems(int[] data) {
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
	 * @param a
	 * @param b
	 * @return true if a contains all the items in b,
	 * false otherwise
	 * return false if either of array passed is null
	 */
	public static boolean contains(int[] a, int[] b) {
		int calhoun = 0;
		int stopper = 0;
		if ((a == null)||(b==null)||(a.length==0)) {
			return false;
		}
		if ((b.length ==0)&& (a.length==1)){
			return true;
		}
		int[] check = new int [a.length];
		int checkint = 0; // value in a that must be found in b
		int fincheck = 0; // the final check to confirm it contains the same items
		
		for (int k=0; k<check.length; k++) { // fill check with 0s.
			check[k] = 0;
		}
		if ((a.length ==1)&& (b.length==1)) {
			if (a[0] == b[0]) {
				return true;
			}
		}
		if (stopper == 0) {
		switch (calhoun) {
		case 0: 
			
			for (int i = 0; i<a.length; i++) {
				
				checkint = a[i];
				for (int c = 0; c<b.length; c++) {
					if ((b[c]==checkint)||(-b[c]==checkint)) {
						
							check[i]= 1;
					}
				}
			calhoun =1;
			}
			
		
		
		case 1: {
			for (int f = 0; f<check.length; f++) {
				if (check[f]==1) {
					
					fincheck = 1;
				}
				if (check[f]==0) {
					
					fincheck = 0;
					break;
				}
			}
		}
		}
		if (fincheck ==1) {
			
			stopper = 1;
			return true;
			
		}
		
		else return false;
		}
		
		return false;
		
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b are mutually reverse, false otherwise
	 * return false if either of the array passed is null
	 */
	public static boolean mutuallyReverse(int[] a, int[] b) {
		int confirm1=0;
		int confirm2=0;
		int v = 0;
		if ((a == null)||(b ==null)) {
			return false;
		}
		int e = b.length-1;
		if ((a.length ==1)&&(b.length == 1)) {
			if (a[0]==b[0]) {
				return true;
			}
			else return false;
		}
		if ((a.length >1)&&(b.length>1)) {
			for (int i = 0; i<a.length; i++) {
				if(a[i]!=b[e]) {
					confirm1= 0;
					break;
				}
				if(a[i]==b[e]) {
					confirm1=1;
					e--;
				}
				
			}
			if(confirm1==0) {
			for (int z = a.length-1; z >=a[0];z--) {
				if(a[z]!=b[v]) {
					confirm2=0;
					break;
				}
				if(a[z]==b[v]) {
					confirm2=1;
					v++;
				}
				
			}
			}
		}
		if ((confirm1==1)||(confirm2==1)) {
			return true;
		}
		else
		return false;
	}
	/**
	 * 
	 * @param n
	 * @return an array containing items {1, 2, ..., n-1, n}
	 * return null if n is less than 0
	 */
	public static int[] generate(int n) {
		
		if (n < 0) {
			return null;
		}
		
		if (n!=0) {
		int[] array = new int[n];
		
		for (int i = 1; i<=n; i++) {
			array[i-1]=i;
			
		}
		
		return array;
		}
		return new int[0];
		 //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the item that appears most in the array,
	 * or the first item that does so in case of a tie
	 * You may assume that array passed is NOT null
	 */
	public static int getMostFrequentItem(int[] data) {
		int numtofind = 0;
		int storetocompare = 0;
		int count = 0;
		int highestcount = 0;
		int mostFreqItem = 0;
		if (data.length == 1) {
			return data[0];
		}
		for (int i = 0; i<data.length; i++) { //scan array for this item
			numtofind = data[i];
			count = 0; // reset count
			for (int k = 0; k<data.length; k++) {
				storetocompare = data[k];
				if (storetocompare == numtofind) {
					count++; //counter goes up if number is found throughout array
					if ((count>0)&&(count>highestcount)) { //MUST be greater than highest count
						highestcount =count;
						mostFreqItem = data[k];
					}
				}
			}
		}
		return mostFreqItem; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing the numbers of occurrences of all distinct items in data
	 * return null if the array is null.
	 */
	public static int[] getFrequencyTable(int[] data) { //this one is complicated
		
		if (data == null) {
			return null;
		}
		
		int count = 0;
		int uniqueitemscount=data.length;
		int numtofind = 0;
		
		
		
		for (int f = 0; f<data.length;f++) {// scan item to test if unique
			numtofind = data[f];
			count = 0; // reset counter
			for (int c = 0; c <data.length; c++) { //scan array at item for uniqueness
				if(data[c]==numtofind) {
					count++;
					if(count>1) {
						uniqueitemscount--; //if it occurs more than once it isn't unique
					}
				}
			}
		}
		
		int[] occurrences = new int[uniqueitemscount]; // declare new array with results from previous loop
		int[] metadata = new int[occurrences.length]; // now we must find which items are unique
		
		for (int d = 0; d<metadata.length; d++) { //metadata committing
			for (int g = 0; g <data.length; g++) { //scan item to test if unique
				numtofind = data[g]; //the item that must be found for counter to go up
				count = 0; // reset counter
				for (int h = 0; h<data.length; h++) { //scan array for uniqueness
					if (data[h]==numtofind) {
						count++;
						if(count>1) {
							
						}
					}
				}
			}
		}
		
		
		
		
		
		for (int i = 0;i<data.length;i++) { //scan occurrences
			numtofind = occurrences[i];
			count = 0; // reset counter
			for (int y =0;y<data.length;y++) {
				if(data[y]==numtofind) {
					count++;
					occurrences[y] = count;
				}
			}
		}
		return occurrences; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param end
	 * @return a subarray of data from the start of the array to index end (inclusive),
	 * return null if array is null or empty or end is invalid
	 */
	public static int[] subarrayUptoIndex(int[] data, int end) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all positive items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getPositives(int[] data) { //Note: Really weird, but question does not include 0 as positive
		int positiveLength=0;
		int k = 0;
		if(data == null) {
			return null;
		}
		if(data.length ==0) {
			return new int[0];
		}
		
		for (int i =0; i<data.length; i++) {//need to scan through array for positives before assigning them (I hate immutability dude)
			if(data[i]>0) {
				positiveLength++;
			}
		}
		int[] positives = new int[positiveLength]; 
		
		
		for (int i = 0; i<data.length; i++) {
			if(data[i]>0) {
				positives[k]=data[i];
				k++;
			}
		}
		return positives; //to be completed
	}
	
	//Custom method by Lachlan Miller for use in GetWithoutNegatives. Same as above but inclusive of 0
	//No unit test for this one yet, so could include errors
	//Seems to work for intended method.
	public static int[] getPositivesInclusiveZero(int[] data) {
		int positiveLength=0;
		int k = 0;
		if(data == null) {
			return null;
		}
		if(data.length ==0) {
			return new int[0];
		}
		
		for (int i =0; i<data.length; i++) {//need to scan through array for positives before assigning them (I hate immutability dude)
			if(data[i]>=0) { //Changed to >=
				positiveLength++;
			}
		}
		int[] positives = new int[positiveLength]; 
		
		
		for (int i = 0; i<data.length; i++) {
			if(data[i]>=0) { //Changed to >=
				positives[k]=data[i];
				k++;
			}
		}
		return positives; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-zero items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getNonZeroes(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-negative items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getWithoutNegatives(int[] data) {
		if(data == null) {
			return null;
		}
		if(data.length==0) {
			return new int[0];
		}
		//Scan data and get total number of positive items
		//Where there is a positive, put at index in copyArr
		//Return copyArr
		//Note, could use getPositives on data
		return getPositivesInclusiveZero(data);
		
	}

	/**
	 * 
	 * @param data
	 * @param idx
	 * @return an array with item at idx (if any) removed.
	 * also remove all adjacent occurrences of item data[idx] 
	 * For example, if data = {10,70,70,70,20,90,70} and idx = 2,
	 * return {10,20,90,70} with item at index 2 (70) and all 
	 * adjacent occurrences removed.
	 * 
	 * if data = null, return null
	 * if index is invalid, return an instance copy of the array
	 */
	public static int[] itemRemovedNeighbourhood(int[] data, int idx) {
		
		if(data == null) {
			return null;
		}
		if((idx<0)||(idx>=data.length)) {
			return data;
		}
		int ArrSize = 0;
		int newArrSize = 0;
		
		//First part: Scan array
		
		for (int i =0; i<=data.length; i++) {
			if (data[i] == data[idx]) {
				newArrSize++;
				
			}
		}
		
		return new int[0];
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return a deep copy of the array passed as parameter,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 * 
	 * TIP: you can use getCopy(int[]) from Stage2 //Done
	 */
	
	public static int[] getCopy(int[] data) { //From Stage 2. Used for getDeepCopy().
		
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
	
	
	public static int[][] getDeepCopy(int[][] data) { //Correct
		if(data == null) {
			return null;
		}
		if(data.length == 0) {
			return new int[0][0];
		}
		
		int[][] new2dArr = new int[data.length][]; //Data has a length of the pointers to the arrays, hence why pointers are initialised to have the length of the data
		
		for (int i = 0; i<new2dArr.length; i++) {
			 new2dArr[i] = getCopy(data[i]);
		}
		return new2dArr;
	}

	/**
	 * 
	 * @param data
	 * @param sub
	 * @return the last index at which sub starts in data
	 * return -1 if sub has a higher length than data or there is no such sub found in data
	 */
	public static int lastIndexOf(int[] data, int[] sub) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of even items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfEvenItems(int[][] data) {
		if((data == null)||(data.length==0)) {
			return 0;
		}
		
		for(int i = 0; i<data.length; i++) {
			for(int k=0; k<data.length; k++) {
				if()
			}
		}
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of positive items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfPositiveItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of unique items in each non-null subarray of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfUniqueItems(int[][] data) {
		
		if(data==null) {
			return 0;
		}
		if(data.length ==0) {
			return 0;
		}
		
		int count = 0;
		for(int i = 0; i<data.length; i++) {
			if(data[i]!=null) { 
				count += countUniqueItems(data[i]);
				System.out.println(count);
			}
		}
		
		return count; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the number of non-null subarrays in data,
	 * return 0 if data is null or empty
	 */
	public static int countNonNullSubarrays(int[][] data) {
		if(data==null) {
			return 0;
		}
		if(data.length ==0) {
			return 0;
		}
		
		int count = 0;
		for(int i = 0; i<data.length; i++) {
			if(getCopy(data[i])!=null) { //Use getCopy to determine whether there is a null subarray or not, as it always returns an int[]
				count++;
			}
		}
		return count; //to be completed
	}
}