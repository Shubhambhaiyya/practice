package practice;

public class Nonstaticstatic {
public int a =777;
public static int b=711;
public static void m1() {
	Nonstaticstatic obj=new Nonstaticstatic();

	System.out.println(obj.a);
	System.out.println(Nonstaticstatic.b);

}
public static void main(String[]args) {
	int b=215;
	System.out.println(b);

	m1();
	Nonstaticstatic obj2=new Nonstaticstatic();
	obj2.a=100;
	System.out.println(obj2.a);
	 m1();
      	 

	
}


}
