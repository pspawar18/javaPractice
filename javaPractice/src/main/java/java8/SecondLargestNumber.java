package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
public static void main(String[] args) {
	int[] randomIntegers = {1, 5, 4, 2, 8, 1, 1, 6, 7, 8, 9};
	int max = Integer.MIN_VALUE;
	int secMax = Integer.MIN_VALUE;
	List<Integer> list = new ArrayList<>();
	for(int i:randomIntegers) {
	    if(!(list.contains(i))){
	        list.add(i);
	    }
	}
	Collections.sort(list);
	System.out.println(list.get(list.size()-1));
	System.out.println(list.get(list.size()-2));
}
}
