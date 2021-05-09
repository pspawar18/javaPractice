package com.example.demo;

import java.util.HashSet;
import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {
	
	Employee e1 = new Employee(1,"Vijay");
	Employee e2 = new Employee(1,"Vijay");
	Employee e3 = new Employee(2,"Pramod");
	Employee e4 = new Employee(2,"Pramod");
	
	HashSet<Employee> hashset = new HashSet<Employee>();
	
	TreeSet<Employee> treeset = new TreeSet<Employee>();
	
	hashset.add(e1);
	hashset.add(e2);
	hashset.add(e3);
	hashset.add(e4);
	
	treeset.add(e1);
	treeset.add(e2);
	treeset.add(e3);
	treeset.add(e4);
	
	System.out.println(hashset);
	System.out.println("  ");
	System.out.println(treeset);
	

	}

}
