package shu;

public class ConstructorRunning {
	public ConstructorRunning() {
	System.out.println("constructor is here");
}
	public ConstructorRunning(int a) {
		this();
		System.out.println("constructor is here again");
	}
	public ConstructorRunning(float a) {
		this(11);
		System.out.print("done for last time");
	}
	public static void main (String[]args) {
		ConstructorRunning obj =new ConstructorRunning(55f);
	}
}