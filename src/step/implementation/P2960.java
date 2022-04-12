package step.implementation;

import java.util.*;

public class P2960 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] list = new int[N + 1];
		list[0] = list[1] = 0;
		for (int i =2; i <= N; i++) {
			list[i] = 1;
		}
		int check = 1;
		for (int i = 2; i <= N ; i++) {
			for (int j = i; j <= N; j+=i) {
				if (list[j] == 1) {
				if (check == K) {
					System.out.println(j);
					return ;
				}
				list[j] = 0;
				check++;
				}
			}
		}
	}
}

