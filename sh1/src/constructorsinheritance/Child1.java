package constructorsinheritance;

public class Child1 extends Parent1 {
	
              public Child1(int b) {
            	  super(50);
           System.out.println("this is child1");
}
             public static void main(String[]args) {
           	  Child1 obj=new Child1(50);
          	  
           	  
            	  
            	  
            //	    public static void main(String[]args) {    ---->> if you want call only parent then remove extend keyword
            //	    	Parent1 obj=new Parent1(true);           --->> and create obj of parent
                  	   
              }
}