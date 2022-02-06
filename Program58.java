package trainingPackage;

import java.util.*;

public class Program58 {

	static int fact(int factNum) {
		if (factNum == 0) {
			return 1; // 0! = 1
		} else {
			return (factNum * fact(factNum-1)); //
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factNum = sc.nextInt();
		System.out.println("The factorial value is "+ fact(factNum));

	}

}
