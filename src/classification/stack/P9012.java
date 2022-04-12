package classification.stack;

import java.util.*;
import java.io.*;

public class P9012 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			System.out.println(solve(str));
			
			
		}
	}
	
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
