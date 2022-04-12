package inflearnjava.string;

import java.util.*;

public class P10 {
	
	public static int[] solution(String str, char c) {
		int [] result;
		result = new int[str.length()];
		int p = 1000;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				p = 0;
				result[i] = p;
			} else {
				p++;
				result[i] = p;
			}
		}
		p = 1000;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (c == str.charAt(i)) {
				p = 0;
				result[i] = p;
			} else {
				p++;
				if (result[i] > p)
					result[i] = p;
			}
		}
		
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for (int x : solution(str,c)) {
			System.out.print(x + " ");
		}
	}
}
