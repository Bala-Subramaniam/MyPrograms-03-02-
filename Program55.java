package trainingPackage2;
import java.util.Scanner;
public class Program55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = sc .nextInt();
		if(armstrongNum(number)==true) {
			System.out.println(number +" is an Armstrong number .");
		}
		else
			System.out.println(number + " is not an Armstrong number .");
		

	}
	
	public static boolean armstrongNum(int i) {
		boolean flag = true;
		int remainder,reverse=0,power=0;
		int givenNum = i;
		while (i != 0) {
			remainder = i % 10;
			reverse *= 10 + remainder;
			power += Math.pow(remainder, 3);
			i = i / 10;
		}
		if (givenNum == power) {
			return (true);

		} else
			return(false);

	}

}
