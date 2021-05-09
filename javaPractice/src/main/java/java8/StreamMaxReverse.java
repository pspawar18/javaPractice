package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMaxReverse {
	public static void main(String[] args) 
    { 
  
        // Creating a list of integers 
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
  
        // Using stream.max() to get maximum 
        // element according to provided Comparator 
        // Here, the smallest element in list 
        // will be stored in variable var 
        Optional<Integer> var = list.stream() 
                     .max(Comparator.reverseOrder()); 
  
        // If a value is present, isPresent() 
        // will return true, else display message 
        if (var.isPresent()) { 
            System.out.println(var.get()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    } 
}
