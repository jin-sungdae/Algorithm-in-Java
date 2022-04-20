package study.dp;

import java.util.*;

public class P1932 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] dp = new int[n + 1][n + 1];
		int [][] result = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < i; j++) {
				dp[i][j] = sc.nextInt();
				if (j == 0) result[i][j] = result[i - 1][j] + dp[i][j];
				else if (j == i - 1) result[i][j] = result[i - 1][j - 1] +dp[i][j];
				else result[i][j] = Math.max(result[i - 1][j - 1], result[i - 1][j]) + dp[i][j];
			}
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i <= n; i++) {
			if (max < result[n][i]) max = result[n][i];
		}

		System.out.println(max);
	}
}
