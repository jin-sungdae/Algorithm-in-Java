package inflearnjava.string;

import java.util.*;

public class P9 {
	public static int solution(String str) {
		int result = 0;
		for (char x : str.toCharArray()) {
			if (x >= 48 && x <= 57) {
				result = result * 10 + (x - 48);
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
