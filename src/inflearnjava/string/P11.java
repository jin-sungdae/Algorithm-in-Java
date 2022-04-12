package inflearnjava.string;

import java.util.*;

public class P11 {
	public static String solution(String str) {
		String result = "";
		int count = 1;
		char c = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			} else if (count > 1){
				result += c;
				result += (char)(count + 48);
				count = 1;
				c = str.charAt(i);
			} else {
				result += c;
				count = 1;
				c = str.charAt(i);
			}
			
		}
		result += c;
		if (count > 1) {
			result += (char)(count + 48);
		}
		
		return result;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
