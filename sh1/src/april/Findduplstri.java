package april;

import java.util.HashMap;
import java.util.Set;

public class Findduplstri {

	
	        public static void main(String[] args) {
				
	        	String a="absgdasbsajwaddueehgkutbjafbhfka";
	        	char[]ab= a.toCharArray();
	        	
	        	HashMap<Character,Integer> smap=new HashMap<Character,Integer>();
	        	
	        	for(char ashu1:ab)
	        		if(smap.containsKey(ashu1))
	        			smap.put(ashu1,smap.get(ashu1)+1 );
	        		else
	        			smap.put(ashu1,1);
	        	
	        			Set<Character> keys= smap.keySet();
	        			for(char key:keys)
	        				if(smap.get(key)>1)
	        					System.out.println(key +" : "+ smap.get(key));
	        			
	        			
	        	
			}
}
