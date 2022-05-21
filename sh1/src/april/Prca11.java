package april;

import java.util.Arrays;

public class Prca11 {

	public static void main(String[] args) {
		
		int a=15;
		int b=45;
		int c=0;
		for(int i=1;i<=b;i++)
		{
			
			c =c+a;                    //multiply without using * 
		}
		 
		
		System.out.println("multiply without using *");
		System.out.println(c);
		
		
		int[] ashu= {10,55,66,78,45};
		int[]ashu1= {11,22,33,45,16,45};
		int[] ashu2= {10,55,66,78,45};
		
		System.out.println(Arrays.equals(ashu,ashu1));
		System.out.println(Arrays.equals(ashu2,ashu1));

		System.out.println(Arrays.equals(ashu,ashu2));      // compare array
		
		
		
		
		
		
		
		

	}
	
	
	
	
}
