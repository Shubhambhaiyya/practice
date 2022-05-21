package practiceset;

public class Pra1 {
    
    	   public static void s1() {
    			System.out.println("s1 is static again");
    		   }
    		public void s2() {
    			System.out.println("s2 is non static");
    		}
    		Pra1(){
    			System.out.println("this is defalut constructor");
    		}
    		Pra1(int a){
    			this();
    		   System.out.println("this is parameterised constructor");
    		}
    		
public static void main(String[] args) {
	int a=30;
	int b=25;
	int c=15;
	if((a>b)&&(a>c)) {
		System.out.println("a is greater");
	}
	if((b>a)&&(b>c)) {
		System.out.println("b is greater");
	}
	if((c>a)&&(c>b)) {
		System.out.println("c is greater");
	}
	
	while(a<b) {
		System.out.println("a is greater again");
	}
	
	for(int i=0;i<=40;i++) {
		
			if(i%4==0) 
			{if(i==28)
				break;
			System.out.println("print it" +"  "+ i);
		}
	}
	Pra1 obj1=new Pra1(25);

	s1();
	obj1.s2();
}}