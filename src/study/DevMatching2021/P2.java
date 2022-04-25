package study.DevMatching2021;
import java.util.*;;
class Solution2 {
    public static int[] solution(int rows, int columns, int[][] queries) {
        
        int [][] board = new int [rows + 1][columns + 1];
        int sum = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < columns; j++) {
        		sum += 1;
        		board[i][j] = sum;
        	}
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int [] x : queries) {
        	min = Integer.MAX_VALUE;
        	int tmp1 = board[x[0] - 1][x[1] - 1];
        	int tmp2 = 0;
        	min = Math.min(min, tmp1);
        	for (int i = x[0] - 1; i < x[2] - 1; i++) {
        		board[i][x[1] - 1] = board[i + 1][x[1] - 1];
        		tmp2 = board[i][x[1] - 1];
        		min = Math.min(min, tmp2);
        	}

        	for (int i = x[1] - 1; i < x[3] - 1;  i++) {
        		board[x[2] - 1][i] = board[x[2] - 1][ i + 1];
        		tmp2 = board[x[2] - 1][i];
        		min = Math.min(min, tmp2);
        	}

        	for (int i = x[2] -  1; i > x[0] - 1; i--) {
        		board[i][x[3] - 1] = board[i - 1][x[3] - 1];
        		tmp2 = board[i][x[3] - 1];
        		min = Math.min(min, tmp2);
        	}

        	for (int i = x[3] -  1; i > x[1] - 1; i--) {
        		board[x[0] - 1][i] = board[x[0] - 1][i - 1];
        		tmp2 = board[x[0] - 1][i];
        		min = Math.min(min, tmp2);
        	}
        	
        	board[x[0] - 1][x[1]] = tmp1;
    		arr.add(min);

        }
        

        int []answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
        	answer[i] = arr.get(i).intValue();
        }
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		int [][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
		for (int x : Solution2.solution(3, 3, queries)) {
			System.out.print(x + " ");
		}
	}
}
