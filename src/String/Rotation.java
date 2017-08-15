package String;

/**
 * Notes:
 * 1. Snapshot explaining the method in evernote
 * @author meghamehta
 *
 */
public class Rotation {
	public static void main(String[] args) {
		String input = "I am happy";
		
		/**
		 * Rotation to be done by how many spots
		 */
		int rot = 7;
		
		System.out.println(rotateString(input, rot));
	}

	private static String rotateString(String input, int rot) {
		
		char[] charArray = input.toCharArray();
		int len = charArray.length;
		
		rot = rot%len;
		
		/**
		 * Starting from index 0, store the position of the character TO BE SHIFTED
		 */
		int source = 0;
		
		/**
		 * Declare variables to store value of characters currently at source and destination indices. 
		 * <br> Initialise sourceChar to letter at index 0
		 */
		char destChar, sourceChar = charArray[0];
		
		int i = 0;
		
		/**
		 * Iterate over the length of the input string
		 */
		while(i < len) {
			/**
			 * Compute location to which the source character will be sent
			 */
			int destination = ( source +rot ) % len;
			
			/**
			 * Once destination index is computed, store the value there in our 'temp' variable for future use
			 */
			destChar = charArray[destination];
			
			charArray[destination] = sourceChar;
			
			/**
			 * Now char at destination index becomes the sourceChars
			 */
			sourceChar= destChar;
			
			/**
			 * destination index will act as the new source
			 */
			source = destination;
			i++;
		}
		return String.valueOf(charArray);
	}

}
