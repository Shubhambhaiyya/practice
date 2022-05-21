package practice;

public class NonstaticVariable {
	public int a = 77;
	
	public static void m1() {
		NonstaticVariable obj3=new NonstaticVariable();
	 System.out.println(obj3.a);
	}
	public void m2() {
		System.out.println(a);
	}
	public static void main(String[]args) {
		m1();
		NonstaticVariable obj=new NonstaticVariable();
		obj.m2();
	}
		

}
