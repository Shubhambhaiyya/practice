package aprilpa1;

public class Zarray {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,44,55,66,95,78,66,45,4142,25,44,49,436,7445,785,996};
		int b=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
				
			}
		}
		
		
		System.out.println("second largest no"+a[1]);
	}

}
