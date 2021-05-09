package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementByStream3 {

	public static void main(String[] args) {
		
		 // Initial stream 
        List<Integer> list 
            = Arrays.asList(5, 13, 4, 
                            21, 13, 27, 
                            2, 59, 59, 34); 
  
        // Print the found duplicate elements 
        System.out.println( 
            findDuplicateInStream(list)); 
    }

	public static <T> Set<T> 
    findDuplicateInStream(List<T> list) 
    { 
        // Return the set of duplicate elements 
        return
  
            // Get the stream from the list 
            list.stream() 
  
                // Count the frequency of each element 
                // and filter the elements 
                // with frequency > 1 
                .filter(i -> Collections.frequency(list, i) > 1) 
  
                // And Collect them in a Set 
                .collect(Collectors.toSet()); 
    } 

}
