package trainingPackage;

import java.util.*;

public class Program38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int i, sum;
		sum = 0;

		for (i = 1; i <= num; i++) {

			sum = sum + i; //loop runs until incremented to 10 and sum adds all numbers passed through loops
		}
		System.out.print(sum); //prints the final value of sum
	}

}
