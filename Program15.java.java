package trainingPackage;
import java.lang.math.*;
import java.util.*;

public class AreaOfPolynomial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	    
		System.out.println("Enter A Value of equn:");
		float a = sc.nextFLoat();
		
		System.out.println("Enter B Value of equn:");
		float b = sc.nextFloat();
		
		float c = sc.nextFloat();
		System.out.println("Enter C value of equn:");
        
		
		double y = (b*b) - 4(a*c); 
		double R = Math.sqrt(y);
		
		
				
		if(R>0){
			  firstRoot = (-b + R)/(2*a);
			  secondRoot = (-b - R)/(2*a);
			  System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
			  }
		else if(R == 0){
			  System.out.println("Root is :: "+(-b + R)/(2*a));
			  }		
		

	}

}
