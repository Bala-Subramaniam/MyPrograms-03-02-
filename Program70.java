package trainingPackage;

import java.util.Scanner;

public class Program70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j == n - i) {
					for (int k = 1; k <= i; k++)
						System.out.print(k + " ");
				} else
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
