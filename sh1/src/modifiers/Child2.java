package modifiers;

final class Child2 {
	public static void  m2() {
		System.out.println("child 2 class");
		  Child1.m1();
	}
	public static void main(String[]args) {
		   m2();
		   Child1.m1();
		   Parent.m3();
	}
}
