package trainingPackage;
import java.util.Scanner;

public class Program57 {
	static int naturalNum(int natNum) {
	if (natNum==0){
		return 0;
	}
	else {
		return (natNum+(naturalNum(natNum-1)));
	}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		sc.close();
		System.out.println("Enter the Number of Sum of Natural numbers needed : ");
		int natNum = sc.nextInt();
		System.out.println("The sum of all natural number is "+naturalNum(natNum));

	}

}
