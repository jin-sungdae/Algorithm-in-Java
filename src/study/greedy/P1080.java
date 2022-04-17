package study.greedy;

import java.util.*;

public class P1080 {
	
	static int n, m;
	
	public static int solution(int [][]A, int [][]B) {
		int result = 0;
		for (int i = 0; i <= n - 3; i++) {
			for (int j = 0; j <= m - 3; j++) {
				if (A[i][j] != B[i][j]) {
					result++;
					for (int p = i; p < i + 3; p++) {
						for (int q = j; q < j + 3; q++) {
							if(A[p][q] == 0) A[p][q] = 1;
							else 
								A[p][q] = 0;
						}
					}
				}
			}
		}
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i][j] != B[i][j]) {
					flag = false;
					break;
				}
			}
		}
		if (flag == false) result = -1;
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int [][]A = new int[n][m];
		int [][]B = new int[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				A[i][j] = str.charAt(j) - '0';

			}
		}

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				B[i][j] = str.charAt(j) - '0';
			}
		}
		System.out.println(solution(A, B));
	}
}
