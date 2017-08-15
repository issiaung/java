package Arrays;

/**
 * http://articles.leetcode.com/searching-element-in-rotated-array/
 * @author meghamehta
 *
 */
public class DOLATER_SearchInSortedRotatedArray {

	public static void main(String[] args) {
		int[] arr ={5,6,7,1,2,3,4};

		/**
		 * Number to search
		 */
		int key = 5;

		System.out.println(findNumberInRotatedArray(arr, 0, arr.length-1, key));
	}

	private static int findNumberInRotatedArray(int[] arr, int low, int high, int key) {
		int pivot = (low+high)/2;

		if(arr[pivot] == key)
			return pivot;

		if (arr[low] <= arr[pivot]){
			if (key < arr[pivot] && arr[low] <= key) {
				return findNumberInRotatedArray(arr, low, pivot-1, key);							
			} 
		} else if (arr[high] >= arr[pivot]){
			if( key > arr[pivot] && arr[high] >= key)
				return findNumberInRotatedArray(arr, pivot+1, high, key);
		}

		return -1;
	}
}