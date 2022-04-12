package inflearnjava.dfsbfs;

import java.util.*;

public class P3 {
	static int N, M;
	static int [][]arr;
	static int total;
	static int t;
	public static void DFS(int L, int sum, int time) {
		if (L == N) {
			if (time > M) return;
			else {
				if (total < sum) total = sum;
				return;
			}
			
		} else {
			DFS(L + 1, sum + arr[L][0], time + arr[L][1]);
			DFS(L + 1, sum, time);
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		DFS(0, 0, 0);
		System.out.println(total);
	}
}
