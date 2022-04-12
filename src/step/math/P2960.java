package step.math;

import java.util.*;

public class P2960 {
	
	public static int solution(int N, int K) {
		int result = 0;
		int [] ch = new int[N + 1];
		
		for (int i = 2; i <= N; i++) {
			if (ch[i] == 0) {
				for (int j = i; j <= N; j = j + i) {
					if (ch[j] != 1) {
						result++;
						ch[j] = 1;
					}
					if (result == K) {
						return j;
					}
				}
			}
		}
		return 0;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(solution(N, K));
	}
}
