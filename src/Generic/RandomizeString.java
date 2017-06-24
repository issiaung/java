package Generic;

import java.security.SecureRandom;

public class RandomizeString {
	static String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	//static String AB = "Cqu:ser1";

	static SecureRandom rnd = new SecureRandom();

	static String randomString( int len ){
		StringBuilder sb = new StringBuilder( len );
		StringBuilder ab = new StringBuilder( AB );

		while( ab.length() > 0) {
			int charPos = rnd.nextInt(ab.length());
			char oldChar = ab.charAt( charPos);//( rnd.nextInt(AB.length()));
			ab.deleteCharAt(charPos);
			sb.append(oldChar);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(randomString(AB.length()));
	}

}
