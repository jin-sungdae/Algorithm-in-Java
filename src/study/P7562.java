package study;

import java.util.*;

class Node3{
	int x, y;
	Node3(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class P7562 {
	
	static int [][]board, dis;
	static int N, w, answer;
	static int []first = new int[2];
	static int []object = new int [2];
	static int []dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int []dy = {1, 2, 2, 1, -1, -2, -2, -1};
	static StringBuilder sb = new StringBuilder();
	static Queue<Node3> Q;
	public static void BFS() {
		answer = 0;
		while (!Q.isEmpty()) {
			Node3 tmp = Q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = tmp.x +dx[i];
				int ny = tmp.y +dy[i];
				if (nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Node3(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			N = sc.nextInt();
			board = new int[N][N];
			dis = new int[N][N];
			Q = new LinkedList<>();
			first[0] = sc.nextInt();
			first[1] = sc.nextInt();
			Q.offer(new Node3(first[0], first[1]));
			object[0] = sc.nextInt();
			object[1] = sc.nextInt();
			if (first[0] == object[0] && first[1] == object[1])
				sb.append("0").append("\n");
			else {
				BFS();
				sb.append(dis[object[0]][object[1]]).append("\n");
			}
		}
		System.out.println(sb);
	}
}
