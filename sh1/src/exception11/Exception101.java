package exception11;

public class Exception101 {

	 public static void main(String[]args) throws InterruptedException {
		 System.out.println("what is this ");
		 Thread.sleep(5000);
		 System.out.println("this is thred sleep");
		 
			
			try{
				System.out.println("buy "+100/0);    
			}
			catch (Exception b){
				System.out.println("got error");b.getMessage();
				}
			
		 
	 }
}
