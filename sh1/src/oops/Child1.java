package oops;

public class Child1 extends Parent{               //inheritance is done here
	 public static void m1() {
		 System.out.println("m1 is static in child");
	 }
	  public void m2() {
		  System.out.println("m2 is non static in child");
	  }
	     public static void main(String[]args) {
	    
	    	     m1();
	    	     Parent.m1();                          //due to inheritance
	    		 Child1 obj1 = new Child1();
	    		 obj1.m2();
	    		 Parent obj2 = new Parent();            //to call parent nonstatic method
	    		 obj2.m2();
	           
	    	 
	     }
}
