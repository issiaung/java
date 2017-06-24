package Generic;

import java.util.Arrays;

public class FirstDuplicateCharacterInString {

	public static void main(String[] args) {
		findFirstDuplicate("aabcdeffghijklmnopqrstuvwxyzz");
	}
	
	public static void findFirstDuplicate(String str){
		char[] charArray = str.toCharArray();
		int[] resultArray = new int[128];
	    Arrays.fill(resultArray, -1);

		for (int i = 0; i < charArray.length; i++) {
			if(resultArray[charArray[i]] != -1) {
				System.out.println("First dupe: " + charArray[i] + " at " + (resultArray[charArray[i]] + 1));
				break;				
			}
			else
				resultArray[charArray[i]] = i;			
		}
	}

}
