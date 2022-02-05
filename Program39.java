package trainingPackage;
import java.util.*;
public class Program39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the factor number : ");
		short factNum = sc.nextShort();
		sc.close();
		short number,factorial;
		factorial = 1;
		for (number=1;number<=factNum;number++) {
			
			factorial *= number;
		}
		
		System.out.println("The factorial value of "+factNum+" is "+factorial+".");
			
	    
		

	}

}
