package trainingPackage;

import java.util.*;

public class Program29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number to be divided : ");
		short number = scan.nextShort();
		System.out.print("Enter the divider number : ");
		short divider = scan.nextShort();
		scan.close();

		int remainder = number % divider;
		int quotient = number / divider;

		System.out.print("Quotient is " + quotient + " and remainder is " + remainder + ".");

	}

}
