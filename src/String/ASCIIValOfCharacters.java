package String;

public class ASCIIValOfCharacters {

	public static void main(String[] args) {

		String str = "If this does not need to be super-fast just create an array of integers, one integer for each letter (only alphabetic so 2*26 integers? or any binary data possible?). go through the string one char at a time, get the index of the responsible integer (e.g. if you only have alphabetic chars you can have 'A' be at index 0 and get that index by subtracting any 'A' to 'Z' by 'A' just as an example of how you can get reasonably fast indices) and increment the value in that index.".toLowerCase().replaceAll(" ", "");
		char[] charArr = str.toCharArray();
		
		int[] freq = new int[256];
		
		for(int i=0; i< charArr.length; i++)
			freq[charArr[i]]++;
		
		//System.out.println(Arrays.toString(freq));
		
		for(int i=0; i< freq.length; i++)
			System.out.println((char)freq[i] + ": " + freq[i]);
	}

}
