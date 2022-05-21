package interface1;

public class Interchild implements Interparent1,Interparent2 {
	
	
	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("i am ashu");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("i am rupesh");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("i am purwal");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("i am vishal");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("i am kishor");
	}
public static void main(String[]args) {
	           
	Interchild obj =new Interchild();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
	}

}
