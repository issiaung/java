package Arrays;

import java.util.Arrays;

/**
 * http://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
 * @author meghamehta
 *
 */
public class FindMissingAndRepeatingNumber {

	public static void main(String[] args) {
		int[] arr = {7, 3, 4, 5, 5, 6, 2};	

		findMissingAndRepeatingNumberMethod(arr);
	}

	private static void findMissingAndRepeatingNumberMethod(int[] arr) {
		/**
		 * Initialize a COUNT ARRAY	which will have maximum index = arr.length+1.
		 * <br>Every index in this COUNT ARRAY will keep a track of number of occurrences of all numbers in arr
		 */
		int[] temp = new int[arr.length+1];

		/**
		 * Initialize array to 0
		 */
		Arrays.fill(temp,0);

		/**
		 * For every number in input array, increment the number stored at corresponding position in temp array
		 */
		for (int num : arr)
			temp[num]++;

		/**
		 * Print the missing and repeated number based on temp's values. 
		 * Missing number will be ZERO
		 * Repeating number will be greater than 1
		 */
		for (int i=1; i<temp.length; i++) {
			if (temp[i]==0) {
				System.out.println("Missing: " + i);
			} else if(temp[i]>1){
				System.out.println("Repeating: " + i);				
			}
		}
	}
}
