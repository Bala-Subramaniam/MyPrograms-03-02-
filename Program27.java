package trainingPackage;
import java.util.*;

public class Program27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the year : ");
		short year = sc.nextShort();
		sc.close();
		
		if(year % 4 ==0 && year % 100 !=0) {
			System.out.println(year+" is a leap year.");
		}
		else if(year % 400 ==0) {
			System.out.print(year+" is a leap year.");
		}
		else
			System.out.println(year+" is not a leap year.");

	}

}
