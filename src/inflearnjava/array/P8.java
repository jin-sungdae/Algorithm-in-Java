package inflearnjava.array;

import java.util.*;

public class P8 {
	
	public static void solution(int [] list) {
		int []answer = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			answer[i] = 1;
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] < list[j]) {
					answer[i]++;
				}
			}
		}
		for (int x : answer) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		solution(list);
	}
}
