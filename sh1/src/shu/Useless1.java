package shu;

public class Useless1 {
	public Useless1() {
		this(50);
		System.out.println("parent deafault");
	}
	public Useless1(int a) {
		this(true);
		System.out.println("parent interr ");
	}
	public Useless1(boolean b) {
		System.out.println("parent trueee");
	}
	
       public static void main(String[]args) {
    	   new Useless1();
	
}
}