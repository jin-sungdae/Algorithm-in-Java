package inflearnjava.dfsbfs;

import java.util.*;

public class P1 {
	static int [] arr;
	static String answer = "NO";
	static int [] ch;
	static int total, N;
	static boolean flag = false;
	public static void DFS(int L, int sum, int[] arr) {
		if (flag) return ;
		if (sum > total / 2) return ;
		if (L == N) {
			if ((total - sum) == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L + 1, sum + arr[L] , arr);
			DFS(L + 1, sum , arr);
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		ch = new int[N + 1];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		DFS(0, 0, arr);
		System.out.println(answer);
	}
}
