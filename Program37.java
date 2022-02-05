package trainingPackage;

import java.util.*;

public class Program37 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.print("Enter a character : ");
	char character = sc.next().charAt(0);
	sc.close();
	
	if (character>='a' && character<='z')
			System.out.println(character+" is a Alphabet.");
	else if (character>='A' && character<='Z')
		System.out.println(character+" is a Alphabet.");
	else
		System.out.println(character+" is not a Alphabet.");
	
		

	}

}
