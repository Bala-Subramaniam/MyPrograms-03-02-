package trainingPackage;
import java.util.*;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter measurement of a single side :");
		float sides = sc.nextInt();  //double sides*=sides; (alternative way)
		double area = sides*sides;  
		System.out.println("The area of a Square is "+area);
		
		
		

	}

}
