package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * http://stackoverflow.com/questions/14948258/given-an-input-array-find-all-subarrays-with-given-sum-k
 * @author meghamehta
 *
 */
public class SubArraysWithGivenSum {

	public static void main(String[] args) {
		
		/*System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);*/

		//For arrays including -ve numbers
		int[] INPUT = {5, 6, 1, -2, -4, 3, 1, 5};
//		int[] INPUT = {5, 6, 1, 4, 3, 1, 1, 5};
		//Method1
		printSubarrays1(INPUT, 5);

		/*		//For arrays including only +ve numbers
		int[] INPUT = {5, 6, 1, 4, 3, 1, 1, 5};
		//Method2
		//https://prismoskills.appspot.com/lessons/Arrays/Find_all_subarrays_with_given_sum.jsp
		printSubarrays2(INPUT, 5);*/
	}

	/**
	 * Only +ve numbers
	 * @param arr
	 * @param sum
	 */
	private static void printSubarrays2(int[] arr, int sum) {

		int currSum = arr[0];
		int start=0, end=0;

		while(end < arr.length) {
			if(currSum == sum)
				System.out.println("Found given sum from " + start + " to " + end);

			if(currSum <= sum) {
				//System.out.println("Sum is: " + currSum);
				end++;
				if(end < arr.length)
					currSum = currSum + arr[end];

			} else {
				currSum = currSum - arr[start];
				start++;
			}

		}
	}

	/**
	 * From: http://stackoverflow.com/questions/14948258/given-an-input-array-find-all-subarrays-with-given-sum-k
	 * @param iNPUT
	 * @param sum
	 */
	private static void printSubarrays1(int[] iNPUT, int sum) {

		//map stores (sum, List<startingIndex>)
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		List<Integer> initial = new ArrayList<Integer>();

		initial.add(-1);
		map.put(0, initial);

		int preSum = 0;

		for (int i = 0; i < iNPUT.length; i++) {
			preSum = preSum + iNPUT[i];

			if(map.containsKey(preSum - sum)) {
				List<Integer> startIndices = map.get(preSum - sum);
				for(int start : startIndices) {
					System.out.println("Start: "+ (start+1)+ "\tEnd: "+ i);
				}
			}

			List<Integer> newStart = new ArrayList<Integer>();
			if(map.containsKey(preSum)) { 
				newStart = map.get(preSum);
			}
			newStart.add(i);
			map.put(preSum, newStart);
		}
	}

}
