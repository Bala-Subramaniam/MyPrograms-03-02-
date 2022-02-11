package trainingPackage2;
import java.util.Scanner;

public class Package59 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)                       
            return hcf(n2, n1 % n2);   // if n2 becomes 0 , it throughs error when dividing.
        else
            return n1;
    }
		
}
	

