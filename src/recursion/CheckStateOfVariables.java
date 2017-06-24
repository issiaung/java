package recursion;

public class CheckStateOfVariables {

	private static  int counter;

	//non-static method can call static field
	private void name() {
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println(method(num));
	}

	public static int method(int i) {
		counter = 0;
		if(i==0)
			return 0;

		System.out.println(i);
		int result = method(--i);
		counter++;
		return result;
	}
}

