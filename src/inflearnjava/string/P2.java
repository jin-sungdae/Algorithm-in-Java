package inflearnjava.string;

import java.util.*;

public class P2 {
	public static String solution(String str) {
		String answer = "";
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else if (Character.isUpperCase(x)) answer+= Character.toLowerCase(x);
		}
		return answer;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
