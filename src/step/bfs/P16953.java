package step.bfs;

import java.util.*;

public class P16953 {

	static Long A, B;
	static Queue<Long> queue = new LinkedList<>();
	
	public static int BFS() {
	
		int L = 0;
		queue.offer(A);
		while (!queue.isEmpty()) {
			int len = queue.size();
			for (int i = 0; i < len; i++) {
				long x = queue.poll();
				if (x == B) return L + 1;
				if (x * 2 <= B) queue.offer(x * 2); 
				if (x * 10 + 1 <= B) queue.offer(x * 10 + 1);
			}
			L++;
		}
		return -1;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextLong();
		B = sc.nextLong();
		System.out.println(BFS());
	}
}
