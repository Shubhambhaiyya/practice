package practiceset;

public class Nstatic2Nstatic { 
	public void r1() {
		System.out.println("r1 is nonstatic");
	}
public void r2() {
	r1();
}
public static void main(String[]args) {
	Nstatic2Nstatic obj2=new Nstatic2Nstatic();
			obj2.r1();
}
}
