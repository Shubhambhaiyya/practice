package stringg;

public class Stringgpracticesession {
    
	  public static void main(String[] args) {
		
		  String acc="rohitsharma";
		     char a= acc.charAt(4);
		     System.out.println(a);
		     
		     String aa="hardik";
		     String ab="pandya";
		     String b=ab.concat(aa);
		     System.out.println(b);
		     
		     
		     String cc="mumbai";
		     String cb="MUMmbai";
		        boolean c=cc.equals(cb);
			     System.out.println(c);
			     
			     String dc="mumbai";
			     String dd="MUMBAI";
			       boolean ddd=dc.equalsIgnoreCase(dd);
				     System.out.println(ddd);

				     String ee="purwal 7077";
						int ef=ee.length();
						System.out.println(ef);
						
				String ff="sachintendulkar";
				 String f= ff.substring(0,5);
					System.out.println(f);
					
					String fg="chabrigang";
					String g=fg.replace("chabri", "halkat");
					System.out.println(g);

				
				
	}
}
