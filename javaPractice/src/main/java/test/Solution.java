package test;

public class Solution {

	  public int solution(int number) {
	    int maxNumber = number;
	     int answer = 0;
	        for(int i = 1; i < maxNumber; i++) {
	            if(i % 3 == 0 || i % 5 == 0) {
	                answer += i;
	            }
	        }
	        System.out.println(answer);
	    return answer;
	  }
	}