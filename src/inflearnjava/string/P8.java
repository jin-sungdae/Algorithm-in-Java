package inflearnjava.string;

import java.util.*;

public class P8 {

	public static String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String temp = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(temp)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}
}
