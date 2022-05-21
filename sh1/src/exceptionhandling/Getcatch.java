package exceptionhandling;

public class Getcatch {
	public static void main(String[]args) {
	System.out.println("registraion");
	System.out.println("login");
	
	try{
		System.out.println("buy "+100/0);    
	}
	catch (Exception b){
		System.out.println("got error");b.getMessage();
		}
	
	
	System.out.println("paynent page");
	System.out.println("thankyou");
	}

}