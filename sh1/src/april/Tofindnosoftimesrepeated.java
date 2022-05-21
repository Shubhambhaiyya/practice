package april;

import java.util.HashMap;
import java.util.Set;

public class Tofindnosoftimesrepeated {
 
	 public static void main(String[] args) {
		 
		String a="gfdywegejgkejfwooypfrfjhjkt";
		
		char[]b=a.toCharArray();
		
		HashMap<Character,Integer> shub=new HashMap<Character,Integer>();
	   
		for(char bhai:b)
			if(shub.containsKey(bhai))
				shub.put(bhai, shub.get(bhai)+1);
			else
				shub.put(bhai, 1);
		
		Set<Character> key=shub.keySet();
		for(char bogas:key)
			if(shub.get(bogas)>1)
				System.out.println(bogas+" :"+shub.get(bogas));
		 
	 }
}
