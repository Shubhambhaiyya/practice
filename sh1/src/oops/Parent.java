package oops;

public class Parent {
	int a=11;
	static int b=12;
	public static void m1() {
		int a=30;
		int b=40;		
		System.out.println("m1 is static in parent");
		
		System.out.println(a);         // calling local a
		
		System.out.println(b);           // calling local b
		
		Parent obj=new Parent();
		
		System.out.println(obj.a);       // calling global a
		
		System.out.println(Parent.b);   // calling global b (it can call by classname.variable name)
	}
		public void m2() {
			System.out.println("m2 is nonstatic in parent");
			
		}
		public static void main(String[]args) {
			m1();
			Parent obj=new Parent();
			obj.m2();
		}
	}


