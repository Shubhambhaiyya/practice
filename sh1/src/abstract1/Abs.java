package abstract1;

public class Abs extends Abs2 {
	
	 public void m7() {
		 
		 System.out.println("over riding is suggested");
	  }
	
	public static void main(String[]args) {
		
		Abs obj=new Abs();
		obj.m7();
		
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
                
	
	//if you make any method abstract then it is coumplsory to make class abstract
	// you can not make a class of abstract method
	//abstract specifiers donot specify body
}
