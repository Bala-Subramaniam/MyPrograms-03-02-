package trainingPackage;
import java.util.*;


public class Program19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		
		//And -returns true when both condition got satisfied
		if (a<=10 && b<50)
			System.out.println("both condition satisfied so "+true);
		else
			System.out.println("one or both failed so "+false);
		
		//OR - returns true if any one satisfied or both satisfied
		if (a==b || b>50)
			System.out.println(true);
		else
			System.out.println(false);
		
		//XOR - it is strict OR .if only one condition satisfies its true
		if (a%2==1 ^ b>=25)
			System.out.println(true);
		else
			System.out.println(false);
			
		//NOT - just returns inverse value if true it give false and viceversa
		
		System.out.println(!(a > 2));	
	
	}
}
