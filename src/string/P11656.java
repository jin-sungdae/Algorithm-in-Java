package string;

import java.util.*;

public class P11656 {
	public static String[] solution(String str) {
		String [] strResult = new String[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			strResult[i] = str.substring(i);
		}
		Arrays.sort(strResult);
		return strResult;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (String x : solution(str)) {
			System.out.println(x);
		}
	}
}
