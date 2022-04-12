package inflearnjava.string;

import java.util.*;

public class P12 {
	
	public static String solution(String str, int n) {
		String result = "";

		for (int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			result += (char)num;
			str = str.substring(7);
		}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(str, N));
	}
}
