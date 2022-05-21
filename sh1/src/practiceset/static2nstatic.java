package practiceset;

public class static2nstatic {
	public static void r1() {
		System.out.println("r1 is static in nonstatic");
	}
	public void r2() {
		r1();
		}
	public static void main(String[]args) {
		static2nstatic obj1=new static2nstatic();
		obj1.r2();
	}

}
