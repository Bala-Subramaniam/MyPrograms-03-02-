package trainingPackage2;

import java.util.*;

public class Program61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter key \"1\" for Octal to Decimal Conversion");
		System.out.printf("\nEnter key \"2\" for Decimal to Octal Conversion\nEnter Key : ");
		if (sc.nextInt() == 1) {
			System.out.print("Enter Octal Value : ");
			octalToDecimal(sc.nextInt());
		} else {
			System.out.print("Enter Decimal Value : ");
			decimalToOctal(sc.nextInt());
			sc.close();
		}
	}

	public static void octalToDecimal(int num) {
		int n = num;
		int reverse = 0;
		short count = 0;
		while (n != 0) {								   //if num =10									
			short remainder = (short) (n % 10);            //10%10 = 1
			if (remainder < 8) {
				reverse += remainder * Math.pow(8, count++);   //0+1+0 => n=1
				n /= 10;									   //1+0.1*8 =>n=0.1 ~ 0
			} else {										   //so finally returns reverse value 
				System.out.println("Enter Number Range of 0,7");
				break;
			}
		}
		if (reverse != 0)
			System.out.print("Decimal value of " + num + " is " + reverse);
	}

	public static void decimalToOctal(int num) {
		int size = 10;
		int n = num;
		int i;
		short arr[] = new short[size];
		for (i = 0; n != 0; i++) {
			if (n == 0) {
				break;
			}
			arr[i] = (short) (n % 8);
			n /= 8;
		}
		while (i >= 0) {
			System.out.print(arr[i]);
			i--;
		}
	}

}
