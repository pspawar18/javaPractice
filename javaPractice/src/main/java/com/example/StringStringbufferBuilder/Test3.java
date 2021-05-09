package com.example.StringStringbufferBuilder;

public class Test3 {

	public static void main(String[] args) {

		String s1 = new String("Durga");
		String s2 = new String("Durga");
		System.out.println(s1==s2);   //false
		System.out.println(s1.equals(s2));//True
		
		StringBuffer sb1 = new StringBuffer("Durga"); //false
		StringBuffer sb2 = new StringBuffer("Durga"); //false
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

	}
	//Object class --equals method is ment for reference/ address comparison
   //	/\
//     /  \	-------------------------------------\
//  String overridden for content comparison   StringBuffer not overwritten 
}
