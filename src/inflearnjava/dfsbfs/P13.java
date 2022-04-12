package inflearnjava.dfsbfs;

import java.util.*;

public class P13 {
	static int n, answer;
	static int [] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int [] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public static void DFS(int x, int y, int[][]board) {
		board[x][y] = 0;
		for (int i = 0; i< 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx <n && ny>= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}
	
	public static void solution(int[][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					answer++;
					DFS(i, j, board);
				}
			}
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(arr);
		System.out.println(answer);
	}
}
