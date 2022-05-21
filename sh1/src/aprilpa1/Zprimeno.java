package aprilpa1;

public class Zprimeno {
  
	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		String primeno =" ";
		for(a=1;a<=100;a++) {
			int count=0;
			for(b=a;b>=1;b--) {
				if(a%b==0) {
					count=count+1;
				}
			}
			if(count==2) {
				primeno=primeno+a+" ";
			}
		}
		
		System.out.println(primeno);
		    
	}}
