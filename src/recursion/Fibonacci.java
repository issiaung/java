package recursion;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {

		int num = 10;
		int[] memo = new int[num+1];
		for (int i = 0; i <=num; i++) {
			System.out.printf("Fibonacci of %d elements is: %d\n", i, fibonacci(i, memo));			
		}
		
		System.out.println(Arrays.toString(memo));
	}

	private static int fibonacci(int num, int[] memo) {
		if(num < 0)
			return 0;

		if(num <=1)
			return num;

		if(memo[num] == 0)
			memo[num] = fibonacci(num-1, memo) + fibonacci(num-2, memo);

			return memo[num];
	}

}
