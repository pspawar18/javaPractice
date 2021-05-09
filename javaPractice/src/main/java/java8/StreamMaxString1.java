package java8;

import java.util.Arrays;
import java.util.Optional;

//Implementation of Stream.max() 
//to get the maximum element 
//of the Stream according to the 
//provided Comparator.

public class StreamMaxString1 {
	public static void main(String[] args) {

		// creating an array of strings
		String[] array = { "Geeks", "for", "GeeksforGeeks", "GeeksQuiz" };

		// Here, the Comparator compares the strings
		// based on their last characters and returns
		// the maximum value accordingly
		// The result is stored in variable MAX
		Optional<String> MAX = Arrays.stream(array)
				.max((str1, str2) -> Character.compare(str1.charAt(str1.length() - 1), str2.charAt(str2.length() - 1)));

		// If a value is present,
		// isPresent() will return true
		if (MAX.isPresent())
			System.out.println(MAX.get());
		else
			System.out.println("-1");
	}
}
