package shu;

public class Useless2 extends Useless1 {
	public Useless2() {
		this(50);
		System.out.println ("child deafault");
	}
	public Useless2(int a) {
		super();
		
		System.out.println("child interr ");
	}
    
	 public static void main(String[]args) {
		
		 Useless2 ch =new Useless2();
	//	System.out.println( ch);
	    
}
}
