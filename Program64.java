package trainingPackage2;

import java.util.*;

public class Program64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int baseNum = sc.nextInt();
		System.out.print("Enter the power value : ");
		int powerVal = sc.nextInt();
		sc.close();
		int result = power(baseNum, powerVal);

		System.out.println(baseNum + "^" + powerVal + "=" + result);
	}

	public static int power(int baseNum, int powerVal) {
		if (powerVal != 0) {
			return (baseNum * power(baseNum, powerVal - 1)); 
		} else { 											 // 5 * (5,2)
			return 1; 										 // 5 * (5,1)
						                                     // 1
		}                                                    // 5*result
			                                                 // 5*5*result
			                                                 // 5*5*5*result
			                                                 // 5*5*5*1
	}

}
