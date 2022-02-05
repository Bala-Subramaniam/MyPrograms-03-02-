package trainingPackage;
import java.util.*;
public class Program16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st circle radius: ");
		double x = sc.nextDouble();
		
		System.out.println("Enter 2nd circle radius: ");
		double y = sc.nextDouble();
		
		double pi = 3.14;
		
		double rad_in = pi *(x*x);
		
		double rad_out = pi * (y*y);
		
		double space = rad_in - rad_out;
		
		System.out.println("The space between two concentric circles is "+space);
		
	}

}
