package trainingPackage2;

import java.util.Scanner;

public class Program51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		sc.close();
		int remainder, power = 0;
		int reverse = 0;
		int givenNum = number;
		while (number != 0) {
			remainder = number % 10;
			reverse *= 10 + remainder;
			power += Math.pow(remainder, 3);
			number = number / 10;
		}
		if (givenNum == power) {
			System.out.println(givenNum + " is a Armstrong number.");

		} else
			System.out.println(givenNum + "is not an Armstrong number.");

	}

}
