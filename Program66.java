package trainingPackage2;

public class Program66 {

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr2[][] = { { 6, 7, 8 }, { 9, 10, 11 }, { 12, 13, 14 } };
		int arr3[][] = new int[3][3];
		System.out.println("The Multiplication of both Matrix is,");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr3[i][j] = arr1[i][j] * arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
