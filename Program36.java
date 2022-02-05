package trainingPackage;

import java.util.*;

public class Program36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Number : ");
		int a = sc.nextInt();
		sc.close();
		if (a > 0)
			System.out.println(a + " is positive integer.");
		else if (a == 0)
			System.out.println(a + " is zero.");
		else
			System.out.println(a + " is Negative integer.");

	}

}
