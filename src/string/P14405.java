package string;

import java.util.*;

public class P14405 {
	
	public static String solution(String str) {
		String result = "YES", newStr = str.replace("pi", "1").replace("ka", "2").replace("chu", "3");
		for (char x : newStr.toCharArray()) {if (x > '3') result = "NO";}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
