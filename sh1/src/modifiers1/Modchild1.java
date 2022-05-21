package modifiers1;

public class Modchild1 {
	public static void  m8() {
		System.out.println("modifier of another class");

}public static void main(String[]args) {
	   m8();
	 //  Child2.m2();
	//   Child1.m1();         //it is default modifier from another package which can not be called
	 //  Parent.m3();  
}
}