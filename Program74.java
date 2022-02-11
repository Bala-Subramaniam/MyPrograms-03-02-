package trainingPackage2;

import java.util.Scanner;

public class Program74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many lines want to print");
		short n = sc.nextShort();
		sc.close();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1)
					for (int k = i; k >= 1; k--)
						System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
