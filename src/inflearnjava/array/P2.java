package inflearnjava.array;

import java.util.*;

public class P2 {
	
	public static int solution(int [] list) {
		int result = 1;
		int temp = list[0];
		for (int i = 1; i < list.length; i++) {
			if (temp < list[i]) {
				temp = list[i];
				result++;
			}
			
		}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		System.out.println(solution(list));
	}
}
