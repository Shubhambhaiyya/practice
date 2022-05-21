package argumentsandreturntype;

public class WithArgumentandNoreturn {
public void m1(int a,int b) {
	int c=a+b;
	System.out.print(c);		
}
public static void main(String[]args) {
	WithArgumentandNoreturn obj=new WithArgumentandNoreturn();
	obj.m1(10,30);
}
}
