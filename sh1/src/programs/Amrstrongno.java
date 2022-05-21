package programs;

public class Amrstrongno {
	public static void main(String[] args) {

		int a = 370;
		int comp = a;
		int rem = 0;
		int result = 0;
		while (comp != 0) {
			
			rem = comp % 10;
			result = comp + (rem * rem * rem);
			comp = comp / 10;
		}
		if (result == a)
			System.out.println("it is armstrong no ;" + a);
		else {
			System.out.println("it is not armstrong" + a);
		}
	}
}