package recursion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-1/
 * @author meghamehta
 *
 */
public class RecursionUsingMemoization {
	static long[] memo;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Fibonacci series of how many terms? ");		
		//No. of terms
		int n = scan.nextInt();
		memo = new long[n+2];
		Arrays.fill(memo,0);
		
		memo[0]=0;
		memo[1]=1;

		scan.close();

		for (int i = 0; i < n; i++) {
			System.out.print(fibByRecursion(i) + " ");
		}
	}

	private static long fibByRecursion(int n) {

		if (n==0) {
			return memo[0];
			
		} else if(n==1) {
			return memo[1];			
		}

		if(memo[n]==0) {
			memo[n] = fibByRecursion(n-1) + fibByRecursion(n-2);
			return memo[n];
		} 
		
		return memo[n];
	}
}
