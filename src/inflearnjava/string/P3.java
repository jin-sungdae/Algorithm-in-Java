package inflearnjava.string;

import java.util.*;

public class P3 {
	public static String solution(String str) {
		String result = "";
		int m = Integer.MIN_VALUE;
		String [] s = str.split(" ");
		for (String x : s) {
			if (m < x.length()) {
				m = x.length();
				result = x;
			}
		}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}
}
