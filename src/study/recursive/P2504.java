package study.recursive;

import java.util.*;
public class P2504 {
	
	static Stack<Character> stack = new Stack<>();
	static int result = 1, answer = 0;
	static String str;

	public static void solution() {
		char a = ' ';
		for (char x : str.toCharArray()) {
			if (stack.isEmpty()) result = 1;
			if (x == '(') {
				stack.push(x);
				result *= 2;
			}
			else if (x == '[') {
				stack.push(x);
				result *= 3;
			} else {
				if (x == ')') {
					if (stack.isEmpty() || stack.peek() != '(') {
						answer = 0;
						return ;
					}
					if (a == '(') {answer += result;}
					stack.pop();
					result /= 2;
				} else if (x ==']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						answer = 0;
						return ;
					}
					if (a == '[') {answer += result;}
					stack.pop();
					result /= 3;
				}
			}
			a = x;

		}
		if (!stack.isEmpty()) answer = 0;
	}

	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		str = sc.next();

		if (str.length() % 2 != 0) {
			System.out.println(0);
			return;
		} else {
			solution();
			System.out.println(answer);
		}
		
	}
}
