package inflearnjava.string;

import java.util.*;

public class P4 {
	public static ArrayList<String> solution (int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String [] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		for (String x : solution(N, str)) {
			System.out.println(x);
		}
	}
}
