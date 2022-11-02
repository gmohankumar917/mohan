package interview;

public class largest_numberInArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int max=a[0],i;
		for(i=1;i<a.length;i++) {
			if(a[i]>a[0])
			{
				max=a[i];
			}
						
		}
		System.out.println(max);
	}

}


//////
///
//
///