package javaInterview;

public class ReverseStringPrograms {

	public static void main(String[] args) {

		String str = "Pramod";
		System.out.println(reverse(str));

	}

	private static String reverse(String str) {
		StringBuffer sb = new StringBuffer();
		char[] charArray = str.toCharArray();
		for( int i = charArray.length -1; i>=0; i--) {
			sb.append(charArray[i]);
		}
		return sb.toString();
	}

}
