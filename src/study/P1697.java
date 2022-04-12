package study;

import java.util.*;

			
public class P1697 {

	static int []ch;
	static int []dis = {-1, 1, 2};
	public static int BFS(int N, int K) {
		Queue<Integer>queue = new LinkedList<>();
		ch = new int [100001];
		queue.offer(N);
		ch[N] = 1;
		int L = 0;
		while (!queue.isEmpty()) {
			int len = queue.size();
			for (int i = 0; i < len; i++) {
				int x = queue.poll();
				for (int j = 0; j < 3; j++) {
					int nx;
					if (j == 2)
						nx = x * 2;
					else
						nx = x + dis[j];
					if (nx == K) return L + 1;
					if (nx >= 0 && nx <= 100000 && ch[nx] == 0) {
						ch[nx] = 1;
						queue.offer(nx);
					}
						
				}
			}
			L++;
		}
		return -1;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if (N == K)
			System.out.println(0);
		else 
			System.out.println(BFS(N, K));
	}
}
