package trainingPackage2;

import java.util.Scanner;

public class Program52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		System.out.println("The Factors of "+number+" are :");
		int i;
		for (i = 2; i <= number; i++) {
			if (number % i ==0) {
				System.out.println(i);
			}
			
		}
			

	}

}
