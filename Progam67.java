package trainingPackage2;

public class Progam67 {

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(arr1[j][i] + " "); //interchanged row and column.
			}
			System.out.printf("\n");  //Transpose of matrix 
		}
	}

}
