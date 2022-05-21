package modifiers;

 class Child1 {
	
		public static void  m1() {
			System.out.println("child 1 class");
	}

public static void main(String[]args) {
	   m1();
	   Parent.m3();   //can call directly without inhertance
}
}