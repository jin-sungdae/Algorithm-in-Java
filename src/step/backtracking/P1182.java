package step.backtracking;

import java.util.*;

public class P1182 {
	static int N, S;
	static int [] arr;
	static int [] ch;
	static int answer, sum;
	static void DFS(int v) {
		if (v == N + 1) {
			sum = 0;
			boolean check = true;
			for (int i = 1; i <= N; i++) {
				if (ch[i] == 1 ) {
					sum += arr[i];
					check = false;
				}
			}
			if (sum == S && check == false) answer+=1;
			return;
		}
		else {
			ch[v] = 1;
			DFS(v + 1);
			ch[v] = 0;
			DFS(v + 1);
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		ch = new int[N + 1];
		arr = new int [N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
			
		}
		DFS(1);
		System.out.println(answer);
	}
}
