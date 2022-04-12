package inflearnjava.twopointers;

import java.util.*;

public class P5 {
	
	public static void solution(int N) {
		int answer = 0, sum = 0;
		int [] list = new int[N / 2 + 1];
		for (int i = 0; i < N / 2 + 1; i++) {
			list[i] = i + 1;
		}
		int lt = 0;
		for (int rt = 0; rt < N / 2 + 1; rt++) {
			sum += list[rt];
			if (sum == N) answer++;
			while (sum >= N) {
				sum -= list[lt++];
				if (sum == N) answer++;
			}
		}
		System.out.println(answer);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		solution(N);
	}
}
