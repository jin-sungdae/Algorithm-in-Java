package study;

import java.util.*;
import java.io.*;

public class P10799 {
	
	public static int solution(String str) {
		int result = 0;
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else if (c == 'R') {
				result += stack.size();
			} else if (c == ')') {
				result += 1;
				stack.pop();
			}
		}
		return result;
	}
	
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		str = str.replace("()", "R");
		System.out.println(solution(str));
	}
}
