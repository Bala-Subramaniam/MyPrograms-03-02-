package trainingPackage;


import java.util.*;

public class Program46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Numbers : ");
		long num = sc.nextLong();
		sc.close();
		String strNum ;
		strNum = Long.toString(num);
		
		StringBuffer revNum = new StringBuffer(strNum);
   
        revNum.reverse();
        System.out.println(revNum);
    }



}


