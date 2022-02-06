package trainingPackage;

import java.util.*;

public class Program53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a for +, b for -, c for *, d for /");
		System.out.print("Enter your first number : ");
		int firstNum = sc.nextInt();
		System.out.print("Enter your second number : ");
		int secondNum = sc.nextInt();
		System.out.print("Enter the operation : ");
		char character = sc.next().charAt(0);
		switch (character) {
		case 'a':
			System.out.printf("The added number is %d .", firstNum + secondNum);
			break;
		case 'b':
			System.out.printf("The subracted number is %d .", firstNum - secondNum);
			break;
		case 'c':
			System.out.printf("The Multiplied number is %d .", firstNum * secondNum);
			break;
		case 'd':
			System.out.printf("The divided quotient is %d .", firstNum / secondNum);
			break;
		case 'e':
			System.out.printf("The divided quotient is %d .", firstNum % secondNum);
			break;
		default:
			System.out.println("Enter the valid key.");
			break;
		}
	}

}
