package april;

public class Secondlargestinarray {
	public static void main(String[] args) {
		
		int[]a= {12,22,55,36,45,74,85,96,85,47,49,45,48};
		int empty=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;
				}
			}
				
			
		}
		
		System.out.println("second largest no"+a[1]);
	}

}
