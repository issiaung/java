package String;

public class StringBuilderOps {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("statement".toUpperCase());
		
		builder.deleteCharAt(1);
		
		System.out.println(builder.charAt(6));
		
		System.out.println(builder);
		
		System.out.println("jHGD".toCharArray());
		
	}

}
