package trainingPackage2;

import java.util.Scanner;

public class Program60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter key \"1\" for Binary to Decimal Conversion");
		System.out.printf("\nEnter key \"2\" for Decimal to Binary Conversion\nEnter Key : ");

		int number = sc.nextInt();
		if (number == 1) {
			System.out.print("Enter Binary Value : ");
			binaryToDecimal(sc.nextLong());
		} else if (number == 2) {
			System.out.print("Enter Decimal Value : ");
			decimalToBinary(sc.nextInt());
			sc.close();
		} else {
			System.out.println("Enter Valid key please.");

		}

	}

	public static void binaryToDecimal(long number) {
		long n = number;
		int decimal = 0;
		short count = 0;										//0 + (1 * 2^0)
		while (n != 0) {										//1 + (1 * 2^1)
			short remainder = (short) (n % 10);					//3 + (0 * 2^2)
			if (remainder == 0 || remainder == 1) {				//3 + (0 * 2^3)
				decimal += remainder * Math.pow(2, count++);	//3 + (1 * 2^4)
				n /= 10;
			} else {
				System.out.println("Give Binary Formats 0's and 1's");
				break;
			}
		}
		if (decimal != 0)
			System.out.print("Decimal value of " + number + " is " + decimal);
	}

	public static void decimalToBinary(int number) {
		int size = number / 5 + 3;
		int n = number;
		int i;
		int arr[] = new int[size];
		for (i = 0; n != 0; i++) {
			if (n == 1) {				//while iteration value stores in array
				arr[i] = 1;             //{0}
				break;                  //{0,0}
			}							//{0,0,1}
			else{						//{0,0,1,0}
				arr[i] = n % 2;			//{0,0,1,0,1}
			}							
			n /= 2;
		}
		while (i >= 0) {				//reversing this row we get binary
			System.out.print(arr[i]);
			i--;
		}
	}

}
