package trainingPackage;

import java.util.*;


public class Program41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter the Range Number:");
		int range = sc.nextInt();

		 int firstVal = 0, secondVal = 1;

	        for (int i = 1; i <= range; ++i)
	        {
	            System.out.print(firstVal+" ");

	            int summedNum = firstVal + secondVal;
	            firstVal = secondVal;
	            secondVal = summedNum;
	        }
	}

}
