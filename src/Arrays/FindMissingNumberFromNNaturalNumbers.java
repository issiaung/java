package Arrays;

public class FindMissingNumberFromNNaturalNumbers {


	/**
	 * https://stackoverflow.com/questions/18335587/finding-the-number-missing-in-the-sequence
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6};

		/**
		 * XOR-ing number with itself gives 0
		 */
		System.out.println("1^1=" + (1^1));

		/**
		 * XOR-ing number with another number gives a completely different result
		 */
		System.out.println("1^2=" + (1^2));

		/**
		 * XOR-ing a series of numbers with the same series gives 0
		 */
		System.out.println("1^2^3^1^2^3=" + (1^2^3^1^2^3));

		/**
		 * XOR-ing a series of numbers with the same series MINUS a particular number will give that number
		 */
		System.out.println("1^2^3^1^2^3^4=" + (1^2^3^1^2^3^4));
		System.out.println("\n****************************************************************\n\n");

		missingAndRepeatingNumber(arr);
	}

	private static void missingAndRepeatingNumber(int[] arr) {

		/**
		 * XOR all numbers of input array and store result in xor1
		 */
		int xor1 = arr[0];		
		for (int i = 1; i < arr.length; i++) {
			xor1 = xor1 ^ arr[i];
		}

		System.out.println(xor1);

		/**
		 * Make n = arr.length
		 * XOR all natural numbers 1...n+1 (n+1 because the actual array will be given array's size + 1)
		 */		
		int xor2 = 1;		
		for (int i = 2; i <=arr.length+1; i++) {
			xor2 = xor2 ^ i;
		}		
		System.out.println(xor2);

		/**
		 * XOR both xor1 and xor2 to find the missing number
		 */
		System.out.println(xor1 ^ xor2);

	}


}
