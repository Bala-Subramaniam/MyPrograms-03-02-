package floatndouble;

import java.util.Scanner;

public class floatAndDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ENTER A VALUE:");
		float a= sc.nextFloat();
		
		System.out.println("ENTER B VALUE:");
		double b = sc.nextDouble();
		
		if (a==b)
			System.out.println("A and B are same");
		else
			System.out.println("They are not equal.");



	}

}
