package study.weeklychallenge;

class Solution7 {
	static int [][] board = new int[51][51];
    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        
    	int answer = 0;
    	for (int i = 0; i < rectangle.length; i++) {
    		for (int j = rectangle[i][0]; j <= rectangle[i][2]; j++) {
    			board[rectangle[i][1]][j] = 1;
    		}
    		for (int j = rectangle[i][0]; j <= rectangle[i][2]; j++) {
    			board[rectangle[i][3]][j] = 1;
    		}
    		for (int j = rectangle[i][1]; j <= rectangle[i][3]; j++) {
    			board[j][rectangle[i][0]] = 1;
    		}
    		for (int j = rectangle[i][1]; j <= rectangle[i][3]; j++) {
    			board[j][rectangle[i][2]] = 1;
    		}
    		
    	}
    	
    	board[characterY][characterX] = 99;
    	board[itemY][itemX] = 88;
    	
    	for (int i = 0; i < 10; i++) {
    		for (int j = 0; j < 10; j++) {
    			System.out.print(board[i][j] + " ");
    		}
    		System.out.println();
    	}
    	
        return answer;
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
