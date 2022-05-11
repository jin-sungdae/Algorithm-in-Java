package study.kakao2018blind;

import java.util.*;

class Point {
	int x;
	int y;
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Solution {
	
	static int []dx = {0, 1, 0, 1};
	static int []dy = {0, 0, 1, 1};
	static char[][] newBoard;
	static int cnt, result;
	public static void bfs(int x, int y) {
		Queue<Point> q = new LinkedList<>();
		cnt = 0;

		char[][] temp = new char[newBoard.length][newBoard[0].length];
		for (int i = 0; i < newBoard.length; i++) {
			for (int j = 0; j < newBoard[0].length; j++) {
				temp[i][j] = newBoard[i][j];
			}
		}      
		q.offer(new Point(x, y));
		char ex = temp[x][y];
		temp[x][y] = '0';

		while (!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];

				if (nx >=0 && nx < newBoard.length && ny >= 0 && ny < newBoard[0].length && temp[nx][ny] == ex) {
					q.offer(new Point(nx, ny));
					temp[nx][ny] = '0';
					cnt++;

				}
			}
		}
		


		if (cnt > 2) {
			result += cnt + 1;
			
		    for (int i = 0; i <newBoard.length; i++) {
	        	for (int j = 0; j < newBoard[0].length; j++) {
	        		System.out.print(temp[i][j] + " ");
	        	}
	        	System.out.println();
	        }
		    System.out.println();
        for (int i = newBoard.length - 1; i >= 0; i--) {
        	for (int j = 0; j < newBoard[0].length; j++) {
        		if (temp[i][j] == '0') {
        			int z = i;
        			int ch = 0;
        			while (temp[z][j] == '0' && z > 0) {
        				z--;
        				ch++;
        			}
        			char c = temp[z][j];
        			for (int a = 0; a <ch ; a++) {
        			for (int t = i; t > z; t--) {
        				temp[t][j] = temp[t - 1][j];
        				temp[t-1][j] = '0';
        			}
        			}
    
  	
        		}
        	}
        
        }
        newBoard = temp;
        for (int i = 0; i <newBoard.length; i++) {
        	for (int j = 0; j < newBoard[0].length; j++) {
        		System.out.print(newBoard[i][j] + " ");
        	}
        	System.out.println();
        }
		}
		
	}
	
    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        newBoard = new char[m][n];
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		newBoard[i][j] = board[i].charAt(j);
        	}
        }

        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (newBoard[i][j] != '0')
        			bfs(i,j);
        	}
        }
        

        return result;
    }
}

public class P1 {
	public static void main(String []args) {
		String [] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		System.out.println(Solution.solution(6, 6, board));
	}
}
