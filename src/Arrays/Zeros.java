package Arrays;

/**
 * Move all zeroes to end of array
 * <b>http://www.geeksforgeeks.org/move-zeroes-end-array/
 * @author meghamehta
 *
 */
public class Zeros {

	public static void main(String[] args) {
		int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

		new Zeros().allZeroesAtEnd(arr);

		for (int i = 0; i < arr.length; i++) {			
			System.out.println(arr[i]);
		}

	}

	private void allZeroesAtEnd(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0)
				arr[count++] = arr[i];
		}

		while(count<arr.length)
			arr[count++] = 0;
	}

}
