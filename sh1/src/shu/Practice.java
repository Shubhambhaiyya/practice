package shu;

public class Practice {
public static void ra1() {
	System.out.println("ra1 is static");
}
	public void ra2() {
		System.out.println("ra2 is non static");
	}
	public static void main(String[]args) {
	 Practice v1=new Practice();
	 ra1();
	 v1.ra2();
	 
}}

