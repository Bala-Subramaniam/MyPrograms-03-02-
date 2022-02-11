package trainingPackage2;

import java.util.Scanner;

public class Program54 {
	public static void main(String[]args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the starting number : ");
	int ini = sc.nextInt();
	System.out.print("Enter the final number : ");
	int fin = sc.nextInt();
	System.out.println("The Prime Numbers between "+ini+" and "+fin+" are ");
	while(ini<fin){
		if (checkPrimeNumber(ini)) 
			System.out.print(ini + " ");
		++ini;
	}
	
	}
	public static Boolean checkPrimeNumber(int num) {
	    boolean flag = true;
		for(int i = 2; i <= num/2; ++i) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
		}
}

