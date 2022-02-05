package trainingPackage;

import java.util.*;

public class Program28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char character = sc.next().charAt(0);
		sc.close();

		short asciiVal = (short) character;
		System.out.println("The ASCII value of " + character + " is " + asciiVal + ".");

	}

}
