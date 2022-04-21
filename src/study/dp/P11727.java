package study.dp;

import java.util.*;

public class P11727 {
	static int dy[];
	
	public static int solution(int n) {
		dy[1] = 1;
		dy[2] = 3;
		for (int i = 3; i <= n; i++)
			dy[i] = (dy[i - 1] + dy[i - 2] * 2) % 10007;
		return dy[n];
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int [n + 10];
		System.out.println(solution(n));
	}
}
