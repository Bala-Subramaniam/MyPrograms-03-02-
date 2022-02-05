package trainingPackage;

import java.util.*;

public class Program32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");

		byte num = scan.nextByte();
		scan.close();
		if (num % 2 == 0)
			System.out.println(num + " is Even number.");
		else
			System.out.println(num + " is Odd number.");

	}

}
