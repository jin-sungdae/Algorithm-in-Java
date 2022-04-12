package inflearnjava.sortingandsearching;

import java.util.*;

public class P1 {
	
	static int[] list;
	
	public static void solution() {
		int temp = 0;
		for (int i =0 ; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
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
