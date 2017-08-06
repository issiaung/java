package practice;

public class StringBuilderTests {
	public static void main(String[] args) {

		String str = "ABCA";

		findAllPermutations(str, "");
	}

	/**
	 * Takes a string str and keeping char at position i fixed, swaps the remaining chars
	 * @param str
	 * @param high
	 * @return
	 */
	private static void findAllPermutations(String string, String permutation) {
		int n = string.length();

		if (n==0) {
			System.out.println(permutation);
		} else {
			for (int i = 0; i < n; i++) {
				findAllPermutations(string.substring(0, i) + string.substring(i+1), permutation + string.charAt(i));
			}
		}
	}
}