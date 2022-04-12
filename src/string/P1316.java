package string;

import java.util.*;

public class P1316 {
	
	public static int solution(String[] str) {
		int result = 0;
		String newStr = "";
		for (int i = 0; i < str.length; i++) {
			newStr += str[i].charAt(0);
			for (int j = 1; j < str[i].length(); j++) {
				 if (str[i].charAt(j - 1) != str[i].charAt(j)) {
					 Character c = str[i].charAt(j);
					 if (newStr.contains(c.toString())) {
							result++;
							break;
						}
					newStr += str[i].charAt(j);
				}
			}
			newStr = "";
		}
		
		return str.length - result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		System.out.println(solution(str));
	}
}
