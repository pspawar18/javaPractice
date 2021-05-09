package java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementByStream {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 59, 59, 21);
		
		System.out.println(findDuplicateInStream(stream));

	}

	public static <T> Set<T> findDuplicateInStream(Stream<T> stream) {
		Set<T> item = new HashSet();
		return stream.filter(n -> !item.add(n)).collect(Collectors.toSet());
	}

}
