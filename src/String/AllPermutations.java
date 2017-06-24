package String;
/**
 * http://javaconceptoftheday.com/permutations-of-string-in-java-recursively/
 * @author meghamehta
 *
 */
public class AllPermutations {

	static String str = "perm";

	public static void main(String[] args) {
		//System.out.println(str.substring(0,1));
		findPermutations("", str);
	}

	public static void findPermutations(String prefix, String str) {
		int n = str.length();
		if (n == 0) System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				findPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
		}
	}
}
