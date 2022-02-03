package trainingPackage;
import java.util.*;
public class AreaOfCylinder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Area-Cylinder = 2(3.14)(r*h)+2(3.14)(r*r)
		
		double pi = 3.14;   //constant value
		
		System.out.println("Enter the radius of Cyclinder:");
		double radius = sc.nextDouble();
		
		System.out.println("Enter the height of Cyclinder:");
		double height = sc.nextDouble();
		
		double areaCyclinder = 2 * pi *(radius*height) + 2*pi* (radius*radius);
		
		System.out.println("The Area of the Cyclinder is "+areaCyclinder);
		
		

	}

}
