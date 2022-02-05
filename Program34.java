package trainingPackage;

import java.util.*;

public class Program34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First number : ");
		int firstNum = sc.nextInt();
		System.out.print("Enter Second number : ");
		int secondNum = sc.nextInt();
		System.out.print("Enter Third number : ");

		int thirdNum = sc.nextInt();
		sc.close();

		if (firstNum > secondNum && firstNum > thirdNum)
			System.out.println(firstNum + " is the greatest number of all.");

		else if (secondNum > thirdNum)
			System.out.println(secondNum + " is the greatest number of all.");
		else
			System.out.println(thirdNum + " is the greatest number of all.");

	}

}
