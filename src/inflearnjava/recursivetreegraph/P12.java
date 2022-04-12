package inflearnjava.recursivetreegraph;
/* 백트래킹 */
import java.util.*;

public class P12 {
	static int [][] graph;
	static int [] ch;
	static int n, m, answer = 0;
	
	static void DFS(int v) {
		if (v == n) answer++;
		else {
			for (int i = 1; i <= n; i++) {
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}

	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n + 1][n + 1];
		ch = new int [n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		DFS(1);
		System.out.println(answer);
	}
}
