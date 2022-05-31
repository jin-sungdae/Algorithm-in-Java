package study.codechallengeseason2;

import java.util.*;

class Solution {
    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stack;
        
        for (int i = 0; i < s.length(); i++) {
        	String tmp = s;
        	boolean ch = false;
        	stack = new Stack<>();
        	for (char x : tmp.toCharArray()) {
        		if (x == '[' || x == '(' || x == '{') {
        			stack.push(x);
        			ch = true;
        		}
        		else if (!stack.isEmpty()){
        			if (x == ']' && stack.peek() == '[')
        				stack.pop();
        			if (x == ')' && stack.peek() == '(')
        				stack.pop();
        			if (x == '}' && stack.peek() == '{') 
        				stack.pop();
        		}	
        	}
        	if (stack.isEmpty() && ch == true) 
        		answer++;

        	
        	s = tmp.substring(1) + tmp.charAt(0);
        }
        return answer;
    }
}

public class P1 {
	public static void main(String []args) {
		System.out.println(Solution.solution(	"}}}"));
	}
}
