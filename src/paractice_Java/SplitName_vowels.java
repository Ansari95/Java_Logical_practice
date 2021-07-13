package paractice_Java;

public class SplitName_vowels {

	public static void main(String[] args) {
		
		String name ="jamin ansari";
		
		
		
		char[] charArray = name.toCharArray();
		
		int count=0;
		
		
		for (int i= 0; i<charArray.length;i++){
			
			if (charArray[i] == 'a'||charArray[i]=='e'|| charArray[i]=='i'||charArray[i]=='o'||charArray[i] =='u'){
			
				System.out.print(charArray[i]);
				count++;
				
					}	}
		System.out.println();
		System.out.println(count);

	}

}
