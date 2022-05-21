package arrray;

import java.util.Arrays;

public class Arraysequalsmethod {
	
	public static void main(String[] args) {
		int[] a = {12,22,45,36,55,48};
		int[] b = {45,22,53,65,49,44};
		int[] c = {45,22,53,65,49,44};
		
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(a,c));
		System.out.println(Arrays.equals(c,b));

	}

}
