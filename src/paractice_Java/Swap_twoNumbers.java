package paractice_Java;

public class Swap_twoNumbers {

	public static void main(String[] args) {
		
	/*	int  mysalary = 10;
		int supSala = 20;
		int temp = mysalary;
		mysalary = supSala;
		supSala=temp;
	
		 
		
		
		System.out.println(mysalary);
		System.out.println(supSala);
		*/
		
		int number = 12345;
		int rem ;
		int reversed = 0;
		
		
		while (number !=0 ){
			
			rem = number %10;
			
			reversed = reversed *10 +number;
			
			number/=10;
		}
		System.out.println(reversed);
	}

}
