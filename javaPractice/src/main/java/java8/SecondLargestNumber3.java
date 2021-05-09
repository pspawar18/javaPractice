package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber3 {
	public static void main(String[] args) {
		Integer[] randomIntegers = { 1, 5, 4, 2, 8, 1, 1, 6, 7, 8, 9 };
		
		System.out.print("Second biggest number in array is:"); 
        Arrays.stream(randomIntegers) 
            .sorted() 
            .limit(randomIntegers.length-1) 
            .skip(randomIntegers.length-2) 
            .forEach(System.out::println); 
	}
}
