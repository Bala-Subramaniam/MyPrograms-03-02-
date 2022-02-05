package trainingPackage;

import java.util.*;

public class Program40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int getNum = sc.nextInt();
		System.out.print("Enter the Multiplier times : ");
		int multiplier = sc.nextInt();
		int i;
		
		for (i = 1; i <= multiplier; i++) {
			int multiVal;
			multiVal = getNum * i;
			System.out.println(getNum+" x "+i+" = "+multiVal);
		}

	}

}
