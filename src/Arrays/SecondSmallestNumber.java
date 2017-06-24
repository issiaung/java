	package Arrays;
	
	/**
	 * http://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
	 * @author meghamehta
	 *
	 */
	public class SecondSmallestNumber {
		static int first;
		static int second;
	
		public static void main(String[] args) {
			int arr[] = {-9, 1, 12, 13, 10, 5, 10, 2, 34, 6, 3};
			find2ndSmallestNumber(arr);
			//print2Smallest(arr);
			System.out.println(first);
			System.out.println(second);
		}
	
		/**
		 * My solution
		 * @param arr
		 */
		private static void find2ndSmallestNumber(int[] arr) {
	
			//Mistake I made: Do not initialize to first element in the array
			//first = second = arr[0];
			
			first = second = Integer.MAX_VALUE;
	
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] < first) {
					second = first;
					first = arr[i];
				} else if(second > arr[i] && arr[i] != first)
					second = arr[i];
	
			}
		}
	
		/**
		 * GeekforGeeks solution
		 * @param arr
		 */
		static void print2Smallest(int arr[])
		{
			int first, second, arr_size = arr.length;
	
			/* There should be atleast two elements */
			if (arr_size < 2)
			{
				System.out.println(" Invalid Input ");
				return;
			}
	
			first = second = Integer.MAX_VALUE;
			System.out.println(Integer.MAX_VALUE);
			for (int i = 0; i < arr_size ; i ++)
			{
				/* If current element is smaller than first
		              then update both first and second */
				if (arr[i] < first)
				{
					second = first;
					first = arr[i];
				}
	
				/* If arr[i] is in between first and second
		               then update second  */
				else if (arr[i] < second && arr[i] != first)
					second = arr[i];
			}
			if (second == Integer.MAX_VALUE)
				System.out.println("There is no second" +
						"smallest element");
			else
				System.out.println("The smallest element is " +
						first + " and second Smallest" +
						" element is " + second);
		}
	
	}
