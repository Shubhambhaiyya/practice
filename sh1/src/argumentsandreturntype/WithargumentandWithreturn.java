package argumentsandreturntype;

public class WithargumentandWithreturn {
	public static boolean m1( int a, int b) {
		int c =a +b;
		if (c==20)
				return true;
		return false;
	}
	public static void main(String[]args) {
		System.out.println (m1(10,20));
	}
	
}
