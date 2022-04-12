package inflearnjava.dfsbfs;

import java.util.*;

class Node4{
	int x, y;
	Node4(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class P14 {
	static Queue<Node4> Q = new LinkedList<>();
	static int [][] board;
	static int n, answer;
	static int [] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int [] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public static void BFS(int x, int y, int [][]board) {
		Q.add(new Node4(x, y));
		while (!Q.isEmpty()) {
			Node4 tmp = Q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					Q.add(new Node4(nx, ny));
				}
			}
		}
	}
	
	public static void solution(int [][] board) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					board[i][j] = 0;
					BFS(i, j, board);
					answer++;
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
