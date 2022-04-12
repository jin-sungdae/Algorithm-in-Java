package study;

import java.util.*;

public class P6198 {
	
	public static long solution(int[] list) {
		long result = 0;
	
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					result++;
				} else {
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int [] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		
		System.out.println(solution(list));
	}
}
