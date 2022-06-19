package study.weeklychallenge;

import java.util.*;

class Point {
	int x; int y;
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Solution7 {
	static int [][] board = new int[101][101];
	static int [][]visited = new int[101][101];
	static int []dx = {-1, 1, 0, 0};
	static int []dy = {0, 0, -1, 1};
	public static void makeBoard(int x1, int y1, int x2, int y2) {
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				if (board[i][j] == 2) continue;
				board[i][j] = 2;
				if (i == x1 || i == x2 || j == y1 || j == y2) {
					board[i][j] = 1;
				}
			}
		}
	}
	
    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        
    	for (int i = 0; i < rectangle.length; i++) {
    		makeBoard(2 * rectangle[i][0],2 * rectangle[i][1], 2 * rectangle[i][2], 2 * rectangle[i][3]);
    	}
    	
    	bfs(characterX * 2, characterY * 2, itemX * 2, itemY * 2);
    	
    	
        return visited[itemX * 2][itemY * 2] / 2;
    }
    
    public static void bfs(int px, int py, int itemx, int itemy) {
    	Queue<Point> q = new LinkedList<>();
    	q.add(new Point(px, py));
    	while (!q.isEmpty()) {
    		Point temp = q.poll();
    		for (int i = 0; i < 4; i++) {
    			int nx = temp.x + dx[i];
    			int ny = temp.y + dy[i];
    			if (nx > 0 && nx < 101 && ny > 0 && ny < 101 && board[nx][ny] == 1) {
    				q.add(new Point(nx, ny));
    				board[nx][ny] = 0;
    				visited[nx][ny] = visited[temp.x][temp.y] + 1;
    			}
    			if (nx == itemx && ny == itemy) break;
    		}
    	}
    }
}

public class P7 {
	public static void main(String []args) {
		int [][] rectangle = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
		//int [][] rectangle = {{4,3,6,9}};
		int characterX = 1, characterY = 3, itemX = 7, itemY = 8;
		System.out.println(Solution7.solution(rectangle, characterX, characterY, itemX, itemY));
	}
}
