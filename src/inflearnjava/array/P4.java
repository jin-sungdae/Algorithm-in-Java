package inflearnjava.array;

import java.util.*;

public class P4 {
	
	public static void solution(int N) {
		int [] list = new int[N];
		list[0] = list[1] = 1;
		for (int i = 2; i < N; i++) {
			list[i] = list[i - 2] + list[i - 1];
		}
		for (int x : list) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		solution(N);
	}
}
