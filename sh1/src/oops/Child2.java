package oops;

public class Child2 extends Parent {
	int a=15;
	static int b=20;
	 public static void m1() {
		 int a=50;
		 int b=100;
		 System.out.println("m1 is static in child");
		 
		 System.out.println( " local "  + a+" "+b);  //calling local var
	 }
	  public void m2() {
		  System.out.println("m2 is non static in child");
		  
		 System.out.println(this.a);     //to call nonstatic global var "a" in nonstatic
		  
	 System.out.println(super.b +"  super keyword");   // using super key word to call global statvar from parent
	 
		System.out.println(super.a+"  super keyword");  // using super key word to call global nonstatvar from parent
		 
		  }
	     public static void main(String[]args) {
	    	 
	    	     m1();                         //calling static from same class
	    	    
	    	     Parent.m1();                 //calling static from parent class
	    		
	    	     Child2 obj1 = new Child2();    // to call non static from same class
	    		 obj1.m2();
	    		
	    		 Parent obj2 = new Parent();     // to call nonstatic method from parent class
	    		 obj2.m2();
	    		 
	    		 System.out.println(Child2.b);  //calling global var "b"
                 
	    		 
	     }
}
