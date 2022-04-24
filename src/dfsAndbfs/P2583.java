package dfsAndbfs;

import java.util.*;

public class P2583 {
	static int M, N, K, answer, sum = 1;
	static ArrayList<Integer> arr = new ArrayList<>();
	static int [][] board;
	static int [] dx = {-1, 0, 1,  0, };
	static int [] dy = {0, 1, 0, -1};
	public static void dfs(int x, int y) {
		board[x][y] = 1;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < M && ny >= 0 && ny < N && board[nx][ny] == 0) {
				board[nx][ny] = 1;
				sum++;
				dfs(nx, ny);
			}
		}
	}
	
	public static void solution() {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 0) {
					answer++;
					dfs(i, j);
					arr.add(sum);
					sum = 1;
				}
			}
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		board = new int[M + 1][N + 1];
		for (int i = 0; i < K; i++) {
			int lx = sc.nextInt();
			int ly = sc.nextInt();
			int rx = sc.nextInt();
			int ry = sc.nextInt();
			for (int j = ly; j < ry; j++) {
				for (int t = lx; t < rx; t++) {
					if (board[j][t] == 0) board[j][t] = 1;
				}
			}
		}

		solution();
		System.out.println(answer);
		Collections.sort(arr);
		for (Integer x : arr) {
			System.out.print(x + " ");
		}
	}
}
