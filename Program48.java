package trainingPackage;
import java.util.*;

public class Program48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		StringBuffer revStr = new StringBuffer(str);
		revStr.reverse();
		StringBuffer revToNormal = new StringBuffer(revStr);
		revToNormal.reverse();
		
		if (revToNormal==revStr) {
			System.out.println(revToNormal+" is a Palindrome.");
		}
		else
			System.out.println(str+" is not a Palindrome.");
		
	}

}
