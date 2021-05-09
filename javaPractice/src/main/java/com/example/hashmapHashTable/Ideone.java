package com.example.hashmapHashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Ideone {

	public static void main(String arg[]) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(102, "Ravi");
		ht.put(101, "Ajay");
		ht.put(101, "Vijay");
		ht.put(103, "Rahul");
		//ht.put(104,null); //Exception in thread "main" java.lang.NullPointerException
		//ht.put(null,null);//Exception in thread "main" java.lang.NullPointerException
		
		System.out.println("----------Hashtable-------------");
		for(Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//Hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100,"Amit"); 
        hm.put(104,"Amit");   
        hm.put(101,"Vijay"); 
        hm.put(102,"Rahul"); 
        hm.put(102,null); 
        hm.put(null,null); //No exception
        hm.put(null,null); 
        System.out.println("----------HashMap-------------");
        for(Map.Entry m : hm.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
	}
}
