package trainingPackage;
import java.util.*;

public class Program42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = sc.nextInt();
		sc.close();
		int lcm;
		lcm = (num1 > num2) ? num1 : num2;

		while (true) {
			if (lcm % num1 == 0 && lcm % num2 == 0) {

				break;
			}
			lcm++;
		}
		int gcd;
		gcd = (num1 * num2) / lcm;
		System.out.printf("The GCD of %d and %d is %d.", num1, num2, gcd);
	}

}
