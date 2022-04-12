package inflearnjava.twopointers;

import java.util.*;

public class P3 {
	
	public static void solution(int K, int[] list) {
		int result = 0;
		int p = 0;
		for (int i = 0; i < K; i++) {
			result += list[i];
		}
		p = result;
		for (int i = K; i < list.length; i++) {
			p = p + list[i];
			p = p - list[i - K];
			if (result < p) {
				result = p;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		solution(K, list);
	}
}
