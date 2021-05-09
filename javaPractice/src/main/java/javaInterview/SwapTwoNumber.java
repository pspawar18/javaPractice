package javaInterview;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		swapNumber(a, b);
		System.out.printf("a = "+a +" b = "+b ); // a is 10, 

	}

	private static void swapNumber(int a, int b) {
		b = b+a;
		a = b-a;
		b = b - a;

	}

}
