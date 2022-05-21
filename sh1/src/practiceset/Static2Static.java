package practiceset;

public class Static2Static { 
	
	public static void r1() {
		System.out.println("r1 is static");
	}
	public static void r2() {
		r1();
	}
	public static void main(String[]args) {
		
	r2();

	}

}
