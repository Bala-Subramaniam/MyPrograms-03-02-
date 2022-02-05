package trainingPackage;

import java.util.*;

public class Program26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// KILOMETER TO MILE CONVERSION
		System.out.print("Enter the distance in kms : ");
		float distanceInKm = sc.nextFloat();

		double miles = distanceInKm / 1.602;
		System.out.println("Distance in miles is " + miles);

		System.out.println("_______________________________________");

		// CENTIGRADE TO FAHRENHEIT CONVERSION
		System.out.print("Enter Temperature's celcius value : ");
		float celcius = sc.nextFloat();
		float fahrenheit = ((celcius * 9) / 5) + 32;
		System.out.println("Temperature in Fahrenheit is " + fahrenheit);

		System.out.println("_______________________________________");

		// SQUARE FT TO ACRE CONVERSION

		System.out.print("Enter the square ft value : ");
		float squareFt = sc.nextFloat();
		sc.close();

		float acres = squareFt / 43_560;
		System.out.println("Area of this land is " + acres + " acres.");

	}

}
