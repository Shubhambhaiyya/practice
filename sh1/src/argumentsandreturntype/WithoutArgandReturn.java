package argumentsandreturntype;

public class WithoutArgandReturn {
	public static void m1() {
		System.out.println("without argument and without return type in static");
	}
	public void m2(){
		System.out.println("without arg and without return type in nonstatic ");
	}
public static void main(String[]args) {
	m1();
	WithoutArgandReturn obj=new WithoutArgandReturn();
	obj.m2();
}
}
