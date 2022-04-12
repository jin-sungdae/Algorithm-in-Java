package inflearnjava.dfsbfs;

import java.util.*;

public class P2 {
	static int C, N;
	static int []arr;
	static int total;
	
	public static void DFS(int L, int sum) {
		if (sum > C) return ;
		else if (L == N) {
			if (total < sum && sum < C) total = sum;
			return ;
		} else {
			DFS(L + 1, sum + arr[L]);
			DFS(L + 1, sum);
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		N = sc.nextInt();
		arr = new int [N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		DFS(0, 0);
		System.out.println(total);
	}
}
