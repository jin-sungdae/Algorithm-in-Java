package inflearnjava.array;

import java.util.*;

public class P12 {
	
	public static void solution(int [][] list, int N, int M) {
		int pi = 0, pj = 0, result = 0, cnt =0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				cnt = 0;
				for (int k = 0; k < M; k++) {
					pi = 0;
					pj = 0;
					for (int s = 0; s < N; s++) {
						if (list[k][s] == i) {
							pi = s;
						}
						if (list[k][s] == j) {
							pj = s;
						}
					}
					if (pi < pj)
						cnt++;
				}
				if (cnt == M)
					result++;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] list = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		solution(list, N, M);
	}
}
