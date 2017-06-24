package Generic;

public class SwapStrings {

	static String a ="Hello";
	static String b ="World";

	public static void main(String[] args) {

		System.out.printf("Before swapping: %s, %s\n", a,b);
		swap();
		System.out.printf("After swapping: %s, %s\n", a,b);
	}

	private static void swap() {
		int bLength = b.length();
		
		a = a + b;
		System.out.println(a);
		
		b = a.substring(0, a.length() - b.length());
		a = a.substring(bLength, a.length());
	}

}
