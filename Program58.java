package trainingPackage;

import java.util.*;

public class Program58 {

	static int fact(int factNum) {
		if (factNum == 0) {
			return 1; // 0! = 1
		} else {
			return (factNum * fact(factNum-1)); //factNum(initial number-5) * fact(factNum-) ==> (5-1) iterates again and again 5 * 4 * 3 * 2 * 1.		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		int factNum = sc.nextInt();
		System.out.println("The factorial value is "+ fact(factNum));

	}

}
