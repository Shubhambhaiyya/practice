package programpractice;

public class toremovespecialcharfromstring {
          public static void main(String[] args) {
			
        	  String a="abjbuepms452c36c7s1s9casjnn45xjdopw#@$#$%^@$$$@@@@uoohifjhbsejhgb2@#$$##################@@@@@@";
        	    
        	 a= a.replaceAll("[^a-zA-Z0-9]","");
        	  System.out.println(a);
        	  
		}
}
