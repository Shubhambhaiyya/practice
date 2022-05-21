package programs;

public class Array1 {
	static int kishor;

	public static void main(String[] args) {

		int[] ashu1 = { 1, 2, 55, 55, 444, 44, 566, 2, 22, 66, 48, 3, 5, 75, 2662, 633, 63, 2, 60, 5, 22, 25, 2, 2,
				25 };
		for (int i = 0; i < ashu1.length; i++) {
			for (int p = i + 1; p < ashu1.length; p++) {
				if (ashu1[i] < ashu1[p]) {
					kishor = ashu1[i];
					ashu1[i] = ashu1[p];
					ashu1[p] = kishor;

				}
			}

		}
		for (int vishal = 0; vishal < ashu1.length; vishal++) {
			System.out.println(ashu1[vishal] + "   ");
		}
	}
}
