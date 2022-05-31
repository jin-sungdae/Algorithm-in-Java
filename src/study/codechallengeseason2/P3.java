package study.codechallengeseason2;

class Solution3 {
    public static int[] solution(int n) {
        int[] answer = new int[(n * (n + 1)) / 2];
        int [][] board = new int [n][n];
        int x = -1, y = 0, num = 1;
        
        for (int i = 0; i < n; i++) {
        	for (int j = i; j < n; j++) {
        		if (i % 3 ==0)
        			x++;
        		else if (i % 3 == 1)
        			y++;
        		else if (i % 3 == 2) {
        			x--;
        			y--;
        		}
        		board[x][y] = num++;
        	}
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if (board[i][j] == 0)
        			break;
        		answer[k++] = board[i][j];
        	}
        }
        return answer;
    }
}

public class P3 {
	public static void main(String []args) {
	for (int x : Solution3.solution(4))
		System.out.print(x + " ");
	}
}
