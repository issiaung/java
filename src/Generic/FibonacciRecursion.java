package Generic;

public class FibonacciRecursion {

	public static void main(String[] args) {
		generateFibSeries(10);
	}
	
	static int generateFibSeries(int n){
		if (n==0) {
			return 1;
		} else {
			return n + generateFibSeries(n-1);
		}
	}
}
