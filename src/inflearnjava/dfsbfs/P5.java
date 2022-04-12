package inflearnjava.dfsbfs;

import java.util.*;

public class P5 {
	
	static int n, m;
	static int []arr;
	static int total = 99999999;
	public static void DFS(int L, int sum) {
		if (sum > m) return ;
		if (L >= total) return ;
		if (sum == m) {
			if (total > L) total = L;
			return;
		} else {
			for (int i = 0; i < n; i++) {
				DFS(L + 1, sum + arr[i]);
			}
		}
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			arr[i] = sc.nextInt();
		}
		m = sc.nextInt();
		DFS(0, 0);
		System.out.println(total);
	}
}
