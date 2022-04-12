package step.backtracking;
import java.util.*;

public class P15649 {
	
	static int N, M;
	static int L = 0;
	static int [] ch;
	static Queue<Integer> q = new LinkedList<>();
	public static void DFS(int v) {
		if (L == M) {
			for (int i : q) {
				System.out.print(i + " ");
			}
			System.out.println();
			return ;
		}
		else {
			for (int i = 1; i <= N; i++) {
				if (ch[i] == 0) {
					ch[i] = 1;
					L++;
					q.add(i);
					DFS(i);
					q.remove(i);
					ch[i] = 0;
					L--;
				}
				
			}
		}
	}
	
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		ch = new int [N + 1];
		DFS(1);
		
	}
}
