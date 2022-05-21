package programpractice;

public class Reversestringandremovespaces {
	public static void main(String[] args) {
		String a="shubham  bhaiyya";
		a=a.replace("  ", "");
		String b="";
		for(int i=a.length()-1;i>=0;i--)
			b=b+a.charAt(i);
		System.out.println(b);
	}

}
