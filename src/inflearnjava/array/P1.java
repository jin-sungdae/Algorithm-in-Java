package inflearnjava.array;

import java.util.*;

public class P1 {
	
	public static void solution(int [] list){
		System.out.print(list[0]);
		for (int i = 1; i < list.length; i++) {
			if (list[i - 1] < list[i]) {
				System.out.print(" " + list[i]);
			}
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		solution(list);
	}
}
