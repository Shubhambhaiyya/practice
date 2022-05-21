package programs;

public class primeno {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		String primeno = "  ";
		for (a = 1; a <= 100; a++) 
		{
			int empty = 0;
			for (b = a; b >= 1; b--)

			{
				if (a % b == 0) {
					empty = empty + 1;
			}
			}
			if (empty == 2) 
			{
				primeno = primeno + a + "  ";
			}
			
		}
		System.out.println("Prime numbers from 1 to 100 are :" );
		System.out.println(primeno);

	}
}
