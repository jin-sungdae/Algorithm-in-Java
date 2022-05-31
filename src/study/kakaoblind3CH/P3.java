package study.kakaoblind3CH;

import java.util.*;

class Point{
	int x; int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Solution3 {
	static Queue<Point> q;
	static char [][] board;
	static int [] dx = {-1, 0, 1, 0};
	static int [] dy = {0, -1, 0, 1};
    public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < 5; i++) {
        	q = new LinkedList<>();
        	board = new char[5][5];
        	for (int j = 0; j < 5; j++) {
        		for (int t = 0; t < 5; t++) {
        			board[j][t] = places[i][j].charAt(t);
        		}
        	}

        	answer[i] = chMethod() ? 1 : 0;  
        }
        return answer;
    }
    
    public static boolean chMethod() {

    	for (int i = 0; i< 5; i++) {
    		for (int j = 0; j < 5; j++) {
    			if (board[i][j] == 'P') {
    				if (!bfs(i, j)) return false;
    			}
    		}
    	}
    	
    	
    	
    	return true;
    }
    
    public static boolean bfs(int x, int y) {
    	
    	Point tmp;
    	q.offer(new Point(x, y));
    	while (!q.isEmpty()) {
    		tmp = q.poll();
    		for (int i = 0; i < 4; i++) {
    			int nx = tmp.x + dx[i];
    			int ny = tmp.y + dy[i];
    			
    			if ((nx >= 0 && nx < 5 && ny >=0 && ny < 5) && (nx != x || ny != y)) {
    				int d = Math.abs(nx - x) + Math.abs(ny - y);
    				if (board[nx][ny] == 'P' && d <= 2)
    					return false;
    				else if (board[nx][ny] == 'O' && d < 2)
    					q.offer(new Point(nx, ny));
    			}

    			
    		}
    		
    	}
    	return true;
    	}

}
public class P3 {
	public static void main(String []args) {
		String [][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		for (int x : Solution3.solution(places)) {
			System.out.println(x);
		}
	}
}
