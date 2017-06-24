package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		boolean result = true;

		for(int i=0; i<expression.length(); i++){
			char c = expression.charAt(i);

			if(c == '{' || c=='[' || c=='(')
					stack.add(c);

			else {
                if(stack.isEmpty()){
                    result = false;
                    break;
                }

				switch(c){
				case '}':
					if('{'!= stack.pop()) result = false;
					break;
				case ']':
					if('['!= stack.pop()) result = false;
					break;
				case ')':
					if('('!= stack.pop()) result = false;
					break;
				}

			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
	}
}

