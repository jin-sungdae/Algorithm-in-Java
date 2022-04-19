package inflearnjava.dynamic;

import java.util.*;

public class P1 {
	
	static int [] dy;
	public static int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for (int i = 3; i <= n; i++) {
			dy[i] = dy[i - 2] + dy[i - 1];
		}
		return dy[n];
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n + 1];
		System.out.println(solution(n));
	}
}
