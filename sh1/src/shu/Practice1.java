package shu;

public class Practice1 {
	public static void s1() {
		System.out.println("s1 is static again");
	}
	public void s2() {
		System.out.println("s2 is non static");
	}
 public static void main(String[]args) {
	 Practice1 s3 =new Practice1();
			 s1();
			 s3.s2();
	 
 }
}
