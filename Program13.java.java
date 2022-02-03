package trainingPackage;
import java.util.*;

public class AreaOfReactangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length value:");    //Area_Rectangle = l*b
		float length = sc.nextInt(); 
		
		System.out.println("Enter the breadth value:");
		float breadth = sc.nextInt();
		
		double area = length * breadth ;
		
		System.out.println("The area of rectangle is "+area);

	}

}
