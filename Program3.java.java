package intAndLong;
import java.util.Scanner;

public class intnLong {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER A VALUE:");
		int a = sc.nextInt();
		System.out.println("ENTER B VALUE:");

		long b = sc.nextLong();
		if (a==b)
			System.out.println("A and B are same");
		else
			System.out.println("They are not equal.");

	}

}
