package paractice_Java;

public class averageValueofArrayElements {

	public static void main(String[] args) {
		
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	
	int B[]= {1,2,3,4,5,6};
	int length2 = B.length;
	System.out.println(length2);
	
	int length = a.length;
	//System.out.println(length);
	
	double total = 0;
	
	for (int i = 0; i < a.length; i++) {
		
		//System.out.println(a[i]);
		
		total = total + a[i];
		
		//System.out.println(total);
		
		
	}
	
	
	
	double averge = total / a.length;
	
	System.out.println(averge);
		

	}

}
