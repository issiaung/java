package String;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		String str1 = "AXYT";
		String str2 = "AYXZ";

		lcs(str1, str2, str1.length(), str2.length());
	}

	private static void lcs(String str1, String str2, int m, int n) {
		/**
		 * Construct a 2-D array
		 */
		int[][] L = new int[m+1][n+1];
		
	}
}
