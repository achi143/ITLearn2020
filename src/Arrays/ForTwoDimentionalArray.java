package Arrays;

public class ForTwoDimentionalArray {

	public static void main(String[] args) {

		int[][] a = { { 3, 4, 2 }, { 7, 4, 6 } };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {

				System.out.print(a[i][j] + " ");

			}
			
			System.out.println();
		}

		

	}

}
