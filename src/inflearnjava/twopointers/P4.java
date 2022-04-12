package inflearnjava.twopointers;

import java.util.*;

public class P4 {
	
	public static int solution(int [] list, int K) {
		int answer = 0, sum = 0, lt = 0;
		for (int rt = 0; rt < list.length; rt++) {
			sum += list[rt];
			if (sum == K) answer++;
			while (sum >= K) {
					sum -= list[lt++];
				if (sum == K) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		System.out.println(solution(list, K));
	}
}
