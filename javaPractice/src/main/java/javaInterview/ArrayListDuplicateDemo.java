package javaInterview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicateDemo {
public static void main(String[] args) {
	
	List<Integer> primes = new ArrayList<Integer>();
	primes.add(1);
	primes.add(2);
	primes.add(3);
	primes.add(4);
	primes.add(5);
	primes.add(5);
	primes.add(9);
	primes.add(2);
	System.out.println("list of prime numbers : " + primes);
	Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>();
	primesWithoutDuplicates.addAll(primes);
	primes.clear();
	
	primes.addAll(primesWithoutDuplicates);
	System.out.println("list of primes without duplicates : " + primes);


}
}
