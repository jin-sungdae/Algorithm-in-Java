package study.findprogrammingmeister;

import java.util.*;

class Point {
	public int x, y;
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Solution{
	static int [][] board, dis;
	static int []dx = {-1, 1, 0, 0};
	static int []dy = {0, 0, -1, 1};
	public static void BFS(int x, int y, int [][]maps) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		maps[x][y] = 1;
		while (!Q.isEmpty()) {
			Point tmp = Q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if (nx >= 0 && nx <maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] == 1) {
					maps[nx][ny] = 0;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	
	public static int solution(int [][]maps) {
		dis = new int[maps.length][maps[0].length];
		BFS(0,0,maps);
		if (dis[maps.length - 1][maps[0].length - 1] == 0)
			return -1;
		return dis[maps.length - 1][maps[0].length - 1] + 1;
	}
}
public class P1 {
	public static void main(String []args) {
		int [][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		System.out.println(Solution.solution(maps));
	}
}
