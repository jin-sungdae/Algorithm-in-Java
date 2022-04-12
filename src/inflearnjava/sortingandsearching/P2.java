package inflearnjava.sortingandsearching;

import java.util.Scanner;

public class P2 {
	
	static int [] list;
	
	public static void solution() {
		int tmp = 0;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j] > list[j + 1]) {
					tmp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = tmp;
				}
			}
		}
		for (int x : list) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		solution();
	}
}
