package arrray;

public class armno {
	public static void main(String[] args) {

		int a = 371;
		int b = a;
		int rem = 0;
		int result = 0;

		while (b != 0) {
			rem = b % 10;
			result = result + (rem * rem * rem);
			b = b / 10;
		}
		if (result == a)
			System.out.println("ni is armstrong" + a);
		else
			System.out.println("not a armstrong number" + a);

	}

}
