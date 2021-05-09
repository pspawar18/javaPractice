package java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Filter {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("lisp");
		list.add("c++");
//filter function
		System.out.println(list);
		Stream<String> stream = list.stream().filter(p -> p.length() > 3);
		String[] arr = stream.toArray(String[]::new);
		
		System.out.println("length "+arr.length);
		
		System.out.println(Arrays.toString(arr));
	}
}