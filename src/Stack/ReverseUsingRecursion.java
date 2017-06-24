package Stack;

import java.util.Stack;

public class ReverseUsingRecursion {

	static Stack<String> s = new Stack<String>();

	public static void main(String[] args) {
		s.push("how");
		s.push("are");
		s.push("you");
		System.out.println(reverse(s.peek()));
		
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

	private static String reverse(String str) {

		if(s.size() == 1)
			return s.push(s.pop());
		else {
			String currentWord = s.pop();
			return reverse(s.pop());
		}
	}
}


