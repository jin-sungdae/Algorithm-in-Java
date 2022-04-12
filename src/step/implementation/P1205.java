package step.implementation;

import java.util.*;

public class P1205 {
	
	public static void solution(int[] list, int score, int P) {
		int ret = 1;
		int N = list.length;
		if (N == P &&  list[list.length - 1] >= score)
			System.out.println(-1);
		else {
			for (int i = 0; i < list.length; i++) {
				if (list[i] > score) {
					ret++;
				} else 
					break;
			}
			System.out.println(ret);
		}
		
		return ;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Score = sc.nextInt();
		int P = sc.nextInt();
		int []list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		solution(list, Score, P);
		
	}
}
