package paractice_Java;

public class MUtable_immutable {

	public static void main(String[] args) {
		
		
		StringBuffer s =new StringBuffer("green");
		StringBuffer append = s.append(" hai");
		System.out.println(append);
		
		System.out.println(s);
		
		
		String s1 = "first";
		String concat = s1.concat(" hello");
		System.out.println(concat);
		System.out.println(s1);

		
	}

}
