package inflearnjava.array;

import java.util.*;

public class P9 {
	
	public static void solution(int [][]list) {
		int result = Integer.MIN_VALUE;
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < list.length; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < list.length; j++) {
				sum1 += list[i][j];
				sum2 += list[j][i];
			}
			result = Math.max(result, sum1);
			result = Math.max(result, sum2);
		}
		sum1 = sum2 = 0;
		for (int i = 0; i < list.length; i++) {
			sum1 += list[i][i];
			sum2 += list[i][list.length - i - 1];
		}
		result = Math.max(result, sum1);
		result = Math.max(result, sum2);
		System.out.println(result);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] list = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		solution(list);
	}
}
