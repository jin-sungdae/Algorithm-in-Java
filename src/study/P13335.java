package study;

import java.util.*;

public class P13335 {
	
	public static int solution(int w, int L, Queue<Integer> list) {
		int result = 0;
		
		int sum = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < w; i++) {
			q.add(0);
		}
		while (!q.isEmpty()) {
			sum -= q.poll();
			if (!list.isEmpty()) {
				if (sum + list.peek() <= L) {
					int temp = list.poll();
					sum += temp;
					q.offer(temp);
				} else {
					q.offer(0);
				}
			}
			result++;
		}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int L = sc.nextInt();
		Queue<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(solution(w, L, list));
	}
}
