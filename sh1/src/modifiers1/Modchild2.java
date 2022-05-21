package modifiers1;

import modifiers.Child3;

public class Modchild2 {
	public static void  m9() {
		System.out.println("modifier of another class");

}
	public static void main(String[]args) {
		   m9();
	//	  Child2.m2(); //it is final modifier from another package which can not be called
		   
		   
		  Child3.m5();  //public class of another package which has child1,child2,parent of other package
		  
		  
		  // Child1.m1();         
		 //  Parent.m3();  
}
}