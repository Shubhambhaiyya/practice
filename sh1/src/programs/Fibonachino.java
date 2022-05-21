package programs;

public class Fibonachino {
	
	public static void main(String[] args) {
		
		int a=-1;
		int b=1;
		int c;
	//	System.out.println(a);
	
		for(int i=1;i<15;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			}
		
	}

}
