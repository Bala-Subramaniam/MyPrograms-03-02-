package trainingPackage;

import java.util.*;

public class Program33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Character : ");
		char chrc = sc.next().charAt(0);
		switch (chrc) {
		case 'a':
			System.out.println(chrc + " is a vowel.");
			break;
		case 'e':
			System.out.println(chrc + " is a vowel.");
			break;
		case 'i':
			System.out.println(chrc + " is a vowel.");
			break;
		case 'o':
			System.out.println(chrc + " is a vowel.");
			break;
		case 'u':
			System.out.println(chrc + " is a vowel.");
			break;
		default:
			System.out.println(chrc + " is a consonant.");
			break;
		}

	}

}
