package trainingPackage;

import java.util.*;

public class Program49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int i = 2;
		boolean flag = false;
		while (i <= num / 2) {
			
			if (num % i == 0) {
				flag = true;
				break;
			}

			i++;
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

}
