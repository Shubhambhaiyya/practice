package shu;

public class NonStatic {
	
	public void method1() {
		System.out.println("method1 is nonstatic");
	}
	public static void main(String[]args){
	NonStatic obj1=new NonStatic();
	
	obj1.method1();
	
	
	}

}
