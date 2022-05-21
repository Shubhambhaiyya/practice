package april;

import java.util.HashMap;
import java.util.Set;

public class HashMapmethod {
                   public static void main(String[] args) {
					
               	   String a="dfghhfhfkqkqjuettevbbhdeoriutdnsjsmlwljrrjj";
                	   
               	   char[] b=a.toCharArray();
                	   
               	   HashMap<Character,Integer> shubham =new  HashMap<Character,Integer>();
                	   
               	   for(char bhai:b)
                		   if(shubham.containsKey(bhai))
               			   shubham.put(bhai,shubham.get(bhai)+1);
                		   else
               				   shubham.put(bhai, 1);
                	  
                			   Set<Character> keys= shubham.keySet();
                					   for(char key:keys)
                						   if(shubham.get(key)>1)
                					   
                						   System.out.println(key +"  "+shubham.get(key));
                					   
                								   
                							   
                						   
                						   
                	   
				}
}
