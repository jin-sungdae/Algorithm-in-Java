package inflearnjava.string;

import java.util.*;

public class P6 {
	public static String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
