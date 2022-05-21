package encapsulation1;

public class Encap1 {

	
	private int a=20;
	private static int b=100;

	public void me(){
		System.out.println("to call value of a into differet method when it is private without using "
				+ "return type you can not call "
				+ "value of a"); 
		System.out.println("this is me"+ "  "+a); 
		System.out.println(b);
		Encap1 objj=new Encap1();
		System.out.println(objj.a);


	//	return (a);
		 
	}
	//  public static void main(String[]args) {
	   
	//	Encap1 obj1= new Encap1();
	//	obj1.me();
	
	// you can print statement without using return type but to print value of  "private a" you have to use reurn type
	
	
	
	}

