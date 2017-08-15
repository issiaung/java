package Arrays;

import java.util.Arrays;

/**
 * http://www.programcreek.com/2015/03/rotate-array-in-java/
 * @author meghamehta
 *
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};

		int num = 5;
		System.out.println("Rotate array by: " + num);

		System.out.println("Rotated array: " + Arrays.toString(rotateArrayBy(arr,num)));
	}

	private static int[] rotateArrayBy(int[] arr, int num) {
		
		num = num % arr.length;
		
		reverseAnArray(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

		reverseAnArray(arr, 0, num-1);
		System.out.println(Arrays.toString(arr));

		reverseAnArray(arr, num, arr.length-1);
		System.out.println(Arrays.toString(arr));

		return arr;
	}

	public static void reverseAnArray(int[] arr, int low, int high){

		while(low<=high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++;
			high--;			
		}
	}

}
