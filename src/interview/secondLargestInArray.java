package interview;



public class secondLargestInArray{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int F_large=a[0];
		int S_large=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>F_large)
			{
				S_large=F_large;
				F_large=a[i];
			}
			else if (a[i]>S_large) {
				S_large=a[i];				
			}
		}
		System.out.println(S_large);
		
	}

}
