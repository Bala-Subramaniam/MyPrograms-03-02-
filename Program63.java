package trainingPackage2;

import java.util.*;

public class Program63 {
	public String reverseString(String str) {

		if (str.length() == 0) {
			return str;
		} else {                //secondword      firstword   ..by recursion task repeats and give reverse word
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	public static void main(String[] args) {
		Program63 rs = new Program63();
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter the word : ");
		String word = sc.nextLine();
		String reverse = rs.reverseString(word);
		System.out.println("The reversed word is :"+reverse);

	}
}