package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber2 {
	public static void main(String[] args) {
		int[] randomIntegers = { 1, 5, 4, 2, 8, 1, 1, 6, 7, 8, 9 };

		List<Integer> list = new ArrayList<Integer>();
		for (Integer intObj : randomIntegers) {
			if(!list.contains(intObj)) {
				list.add(intObj);
				
			}
		}
		Collections.sort(list);
		
		System.out.println("First Largest element in the List ="+list.get((list.size()-1)));
		System.out.println("Second Largest element in the List ="+list.get((list.size()-2)));
	}
}
