package modifiers;

public class Child3 {
	public static void  m5() {
		System.out.println("child 3 class");
		  Child2.m2();                       //final of same class
	}
	public static void main(String[]args) {
		   m5();
		 //  Child2.m2();
		   Child1.m1();               //default of same class
		   Parent.m3();               //public of same class
	}

}
