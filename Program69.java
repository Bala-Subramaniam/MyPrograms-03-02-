package trainingPackage;

import java.util.*;

public class Program69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		 for (int i =0; i <=n ; i++) {
			for (int j =0 ;j<=n; j++) {
				if (j==n-i)
				{
					for (int k=1;k<=i;k++)
						System.out.print(i+" ");
				}else
					System.out.print(" ");
			}
			System.out.print("\n");
		} 
		 
		
		/*for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int k =1; k<=n;k++) {
			for (int l =1; l<=k;l++) {
				System.out.println(" *");
			}
		}System.out.println(" "); */
	}

}
