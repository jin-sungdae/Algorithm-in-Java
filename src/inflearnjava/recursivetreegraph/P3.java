package inflearnjava.recursivetreegraph;

import java.util.*;

public class P3 {
	
	public static int solution(int N) {
		if (N == 1) return 1;
		else {
			return N * solution(N - 1);
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(solution(N));
	}
}
