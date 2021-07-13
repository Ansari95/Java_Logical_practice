package paractice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class replace10_100InList {

	public static void main(String[] args) {
		
		Integer [] array = {10,20,30,40};
		List <Integer> a = new ArrayList<>(Arrays.asList(array));
		
		System.out.println(a);
		a.add(50);
		
		System.out.println(a);
		
		 a.set(0, 100);
		System.out.println(a);
		
		Integer integer = a.get(2);
		System.out.println(integer);
		

	}

}
