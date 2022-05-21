
public class Nonstatic2Nonstatic {
	public void r1() {
		System.out.println("r1 is nostatic to nonstatic");
	}
	public void r2() {
		r1();
	}
	public static void main(String[]args) {
		Nonstatic2Nonstatic obj1=new Nonstatic2Nonstatic();
		obj1.r2();
	}
}
