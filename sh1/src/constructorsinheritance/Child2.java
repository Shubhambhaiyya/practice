package constructorsinheritance;

public class Child2 extends Child1{
	public Child2() {
		super(50);
		System.out.println("child2");  
	}
	public static void main(String[]args) {
		new Child2();
	}
}
