package april;



import java.util.ArrayList;
import java.util.TreeSet;

public class Treesetmethod {
	public static void main(String[] args) {
		
		int[]a= {11,22,15,13,14,16,44,15,66,45,2,4455,222,445};
		
		
		TreeSet shubh=new TreeSet();
		for(int bhai:a)
			shubh.add(bhai);
		
		ArrayList arr=new ArrayList(shubh);
		System.out.println("2nd largest no in array"+arr.get(arr.size()-2));
		
		///as length of array is length-1
		
		System.out.println("2nd lowest no in array"+arr.get(1));
		
	// as array index start from 0
	}

}
