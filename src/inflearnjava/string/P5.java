package inflearnjava.string;

import java.util.*;

public class P5 {
	public static String solution(String str) {
		String result = "";
		char []c = str.toCharArray();
		int it = 0;
		int rt = str.length() - 1;
		while (it < rt) {
			if (!Character.isAlphabetic(c[it])) {
				it++;
			} else if (!Character.isAlphabetic(c[rt])) {
				rt--;
			} else {
				char temp = 0;
				temp = c[it];
				c[it] = c[rt];
				c[rt] = temp;
				it++;
				rt--;
			}
		}
		result = String.valueOf(c);
		
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
