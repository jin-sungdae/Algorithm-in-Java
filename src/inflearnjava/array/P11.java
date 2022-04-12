package inflearnjava.array;

import java.util.*;

public class P11 {
	
	public static void solution(int [][] list, int N) {
		int result = 0 , max = Integer.MIN_VALUE;

		for (int i = 1 ; i < N; i++) {
			int cnt = 0;
			for (int j = 1; j < N; j++) {
				for (int k = 1; k <= 5; k++) {
					if (list[i][k] == list[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if (max < cnt) {
				max = cnt;
				result = i;
			}
		}
	
		System.out.println(result);
		
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] list = new int[N + 1][6];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < 6; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		solution(list, N);
	}
}
