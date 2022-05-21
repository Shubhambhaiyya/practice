package shu;

public class Useless {
	public static void main(String[]args) {

	
		for(int x=2;x<=2;x++) {
			if(x%2==0) {
				System.out.println("prime number"+x);
		      }
			   }	
		for(int x=2;x<=17;x++) {
			if((!(x%2==0))&&(!(x%9==0))) {
				System.out.println("prime number"+x);
				}
			}	
		 for(int x=2;x<=300;x++) {
	if((!(x%2==0))&&(!(x%3==0))&&(!(x%5==0))&&(!(x%7==0))&&(!(x%11==0))&&(!(x%13==0))&&(!(x%17==0)))  {
		System.out.println("prime number"+x);
		
		
	}
              }
		 }}