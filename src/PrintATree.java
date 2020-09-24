
public class PrintATree {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			// System.out.println(i);

			for (int j = 0; j < 10 - i; j++) {
				System.out.println(" ");
			}

			for (int k = 0; k < (2 * i + 1); k++) {

				System.out.println("*");
			}

			System.out.println();
		}

		for (int l = 0; l < 5; l++) {
			System.out.println("\t *");
		}
	}
}
