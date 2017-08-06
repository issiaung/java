package Arrays;

import java.util.Arrays;

/**
 * http://javabypatel.blogspot.in/2016/10/merge-two-sorted-arrays-in-java.html
 * @author meghamehta
 *
 */
public class Merge2SortedArrays {

	public static void main(String[] args) {
		int[] a1 = {10,15,22,80};
		int[] a2 = {5,8,11,15,70,90};

		System.out.println(Arrays.toString(merge(a1,a2)));

	}

	private static int[] merge(int[] a1, int[] a2) {
		int[] result = new int[a1.length + a2.length];

		/**
		 * l1 is the left pointer for first input array
		 * l2 is the left pointer for first input array
		 * l is the left pointer for resultant array		 
		 * */
		int l1,l2,l;

		/**
		 * Initialize all to zero
		 */
		l1=l2=l=0;

		/**
		 * Keep iterating till one of the input arrays terminates
		 */
		while(l1 < a1.length && l2 < a2.length){
			/**
			 * If element at a1 is smaller, store that in result array and increment both l1 and l, keeping l2 the same
			 */
			if (a1[l1] < a2[l2]) {
				result[l++] = a1[l1++];
			}
			/**
			 * If element at a2 is smaller, store that in result array and increment both l2 and l, keeping l1 the same
			 */
			else if(a1[l1] > a2[l2]) {
				result[l++] = a2[l2++];
			}
			/**
			 * If element at both a1 and a2 is the same, store both in result array and increment all l1, l2 and l
			 */
			else {
				result[l++] = a1[l1++];
				result[l++] = a2[l2++];
			}
		}

		/**
		 * This block is reached after violation of above while condition. 
		 * <br>Figure out which array terminated first
		 */
		if (l1==a1.length) {
			/**
			 * a1 terminated first. Add remaining elements in a2
			 */
			while (l2 < a2.length) {
				result[l++] = a2[l2++];
			}
		} else {
			/**
			 * a2 terminated first. Add remaining elements in a1
			 */
			while (l1 < a1.length) {
				result[l++] = a1[l1++];
			}
		}
		return result;
	}

}
