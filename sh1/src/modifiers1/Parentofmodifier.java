package modifiers1;


import modifiers.Parent;

public class Parentofmodifier {
	public static void  m7() {
		System.out.println("modifier of another class");

}
	public static void main(String[]args) {
		   m7();
		 //  Child2.m2();
		 //  Child1.m1();
		   Parent.m3();      // from another package whose modifier is public
}
}