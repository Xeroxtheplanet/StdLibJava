package practicePackage._02_arrays.attempts;

/**
 * VERY IMPORTANT!!!
 * 
 * YOU DON'T NEED A LOOP FOR ANY FUNCTION IN STAGE 1.
 * 
 * @author gauravgupta
 *
 */
public class Stage1 {


	/**
	 * May be helpful for other methods
	 * 
	 * @param data
	 * @return true if array is null, false otherwise
	 */
	public static boolean isNull(int[] data) {
		if (data == null) {
			return true;
		}
		return false; //to be completed
	}

	/**
	 * May be helpful for other methods
	 * 
	 * @param data
	 * @return true if array passed is empty (or null), false otherwise
	 */
	public static boolean isEmpty(int[] data) {
		if ((data ==null)|| (data.length == 0)) {
			return true;
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return 0 if array is null or empty, 
	 * otherwise return the last item
	 */
	public static int getLastItem(int[] data) {
		if (isEmpty(data) == true) {
			return 0;
		}
		return data[data.length-1]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return false if array passed is null or has less than two items,
	 * otherwise 
	 * return true if the second last item is less than the last item,
	 * otherwise return false
	 */
	public static boolean secondLastLessThanLast(int[] data) {
		if ((isNull(data)==true)||(data.length<2)) {
			return false;
		}
		if(data[data.length-2] < data[data.length-1]) {
			return true;
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return 0 if the array passed is null or has less than two items,
	 * otherwise return the sum of the first and the last items 
	 */
	public static int getSumFirstLastItems(int[] data) {
		if ((isNull(data)==true)||(data.length<2)) {
			return 0;
		}
		return data[0] + data[data.length-1]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param idx
	 * @return 
	 * if an item exists in the passed array at the passed index, return that item,
	 * return 0 otherwise
	 */
	public static int get(int[] data, int idx) {
		if ((isNull(data)==false) && (idx < data.length)&& (idx >= 0)) {
			return data[idx];
		}
		return 0; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if the two arrays have the same number of items.
	 * return false if either is null
	 */
	public static boolean sameSize(int[] a, int[] b) {
		if ((a == null)||(b==null)) {
		return false; //to be completed
		}
		if(a.length == b.length) {
			return true;
		}
		return false;
	}
}