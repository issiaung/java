package String;
/**
 * http://javaconceptoftheday.com/permutations-of-string-in-java-recursively/
 * @author meghamehta
 *
 */
public class AllPermutations {

	/**
	 * Best explanation: http://javabypatel.blogspot.in/2015/08/program-to-print-permutations-of-string-without-repetition.html
	 */
	static String str = "abc";

	public static void main(String[] args) {
		//System.out.println(str.substring(0,1));
		findPermutations("", str);
	}

	public static void findPermutations(String prefix, String str) {
		int n = str.length();
		if (n == 0) System.out.println("FINAL: " + prefix);
		else {
			for (int i = 0; i < n; i++) {
				System.out.print(prefix + str.charAt(i) + "\t");
				System.out.print(str.substring(0, i) + "\t");
				System.out.println(str.substring(i+1));
				findPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
			}
		}
	}
}
