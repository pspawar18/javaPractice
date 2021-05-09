package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementByStream2 {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(5,13,4, 21,13,59,59,21,21);
		Set<Integer> item = new HashSet();
		Set<Integer> item2 = new HashSet();
		
		Integer[] randomIntegers = { 1, 5, 4, 2, 8, 1, 1, 6, 7, 8, 9 };

		List<Integer> list = Arrays.asList(randomIntegers);
		
		//return ;
		System.out.println(stream.filter(n-> !item.add(n)).collect(Collectors.toSet()));
		//System.out.println(stream.filter(n-> !item.add(n)).collect(Collectors.toList()));
		System.out.println(item);
		System.out.println(list.stream().filter(n-> !item2.add(n)).collect(Collectors.toSet()));

	}

	/*
	 * public static <T> Set<T> findDuplicateInStream(Stream<T> stream) { Set<T>
	 * item = new HashSet(); return stream.filter(n->
	 * !item.add(n)).collect(Collectors.toSet()); }
	 */

}
