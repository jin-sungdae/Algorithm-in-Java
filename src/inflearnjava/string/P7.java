package inflearnjava.string;

import java.util.*;

public class P7 {
	public static String solution(String str) {
		String result = "YES";
		String str2 = str.toUpperCase();
		for (int i = 0; i < str2.length() / 2; i++) {
			if (str2.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
				result = "NO";
			}
		}
		return result;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
