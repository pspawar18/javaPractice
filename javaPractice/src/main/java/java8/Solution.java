package java8;

public class Solution {
	public static void main(String[] args) {
        int maxNumber = 10;
        long answer = 0;
        for(int i = 1; i < maxNumber; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}

//
