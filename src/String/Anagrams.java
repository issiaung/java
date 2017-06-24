package String;

import java.util.Arrays;

/**
 * Find out whether two strings are anagrams or not
 * Solution taken from: https://www.hackerrank.com/rest/contests/master/challenges/java-anagrams/hackers/Schuetzl/download_solution
 * Done on April 28
 */
public class Anagrams {

	static boolean isAnagram(String A, String B) {

		char[] arrA = A.replaceAll(" ", "").toUpperCase().toCharArray();
		char[] arrB = B.replaceAll(" ", "").toUpperCase().toCharArray();
		Arrays.sort(arrA);
		Arrays.sort(arrB);

		for(int i = 0; i < arrA.length; i++) {
			try {
				if(Character.toUpperCase(arrA[i]) != Character.toUpperCase(arrB[i])){
					System.out.println("NOT Anagrams");
					return false;
				}
			} 
			catch(Exception e) {
				System.out.println("NOT Anagrams");
				return false;
			}			
		}
		System.out.println("Anagrams");
		return true;

	} 

	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");

		isAnagram("keEp", "peeK");

		isAnagram("SiLeNt CAT", "LisTen AcT");

		isAnagram("Debit Card", "Bad Credit");

		isAnagram("School MASTER", "The ClassROOM");

		isAnagram("DORMITORY", "Dirty Room");

		isAnagram("ASTRONOMERS", "NO MORE STARS");

		isAnagram("Toss", "Shot");

		isAnagram("joy", "enjoy");

		/*		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		boolean ret=isAnagram(A,B);
		if(ret)System.out.println("Anagrams");
		else System.out.println("Not Anagrams");*/

	}

}
