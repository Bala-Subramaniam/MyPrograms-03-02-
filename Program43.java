package trainingPackage;
import java.util.Scanner;

public class Program43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int lcm;
		lcm = (num1>num2)?num1:num2;
		
		while (true) {
			if(lcm % num1 ==0 && lcm % num2 ==0) {
				System.out.printf("The lCM of %d and %d is %d",num1,num2,lcm);
				break;
			}++lcm;
		}
	
	}

}
