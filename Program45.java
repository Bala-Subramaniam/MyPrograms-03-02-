package trainingPackage;

import java.util.*;

public class Program45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		sc.close();
		String digits; // converting int number to string for getting length
		digits = String.valueOf(number);

		System.out.printf("There are %d digits in %d.", digits.length(), number);

	}

}
