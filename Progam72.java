package trainingPackage2;
import java.util.*;
public class Progam72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1) {
					int k;
					for (k = 1; k <= i; k++)           //print first half by increasing values
						System.out.print(" " + k + " "); 
					for (k = i - 1; k >= 1; k--)		//gives second half by decreasing values
						System.out.print(" " + k + " ");
				} else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
