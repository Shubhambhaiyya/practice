package arrray;

public class Program1 {

  public static void main(String[] args) {
	  int acc;
	 
	int [] ab= {1,2,3,4,55,66,22,55,11,44,88,55,8,6,85,855,522,555,4555,2225,554,55};
	
	for(int i=0;i<ab.length;i++) 
	{
	for(int  p=i+1;p<ab.length;p++)
	{
	    acc=0;
		if(ab[i]>ab[p])
		{	
			acc=ab[i];
			ab[i]=ab[p];
			ab[p]=acc;
		}
}}
	
	for(int i=0;i<ab.length;i++) 
		System.out.println(ab[i]);
  
  }
}