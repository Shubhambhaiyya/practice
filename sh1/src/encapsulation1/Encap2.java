package encapsulation1;

public class Encap2 {
	
	   public void m2() {
		   System.out.println("this is providing security to a");
		   
	   }
	
	   public static void main(String[]args) {
		   Encap2 obj =new Encap2();
		   obj.m2();
		   Encap1 obj1=new Encap1();
		   obj1.me();
	}

}
