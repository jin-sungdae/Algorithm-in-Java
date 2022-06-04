package study.summerandwintercoding2018;

class Solution3 {
	static boolean [][][][]board = new boolean[11][11][11][11];
	static int [] dx_ = {0, 0, 1, -1};
	static int [] dy_ = {-1, 1, 0, 0};
    public static int solution(String dirs) {
        int answer = 0;

        int dy = 5, dx = 5, ndy = 5, ndx = 5, index = 0;
        for (char c : dirs.toCharArray()) {
        	dy = ndy;
        	dx = ndx;
        	if (c == 'U' && dy >= 0 && dy <= 10) 
        		index = 0;
        	else if (c == 'D' && dy >= 0 && dy <= 10) 
        		index = 1;
        	else if (c == 'R' && dx >= 0 && dx <= 10) 
        		index = 2;
        	else if (c == 'L' && dx >= 0 && dx <= 10) 
        		index = 3;
        	
        	ndx += dx_[index];
        	ndy += dy_[index];
        	if (ndx < 0 || ndy < 0 || ndx > 10|| ndy > 10) {
        		ndx -= dx_[index];
        		ndy -= dy_[index];
        		continue;
        	}
        	
        	if (!board[dy][dx][ndy][ndx] && !board[ndy][ndx][dy][dx]) {
        		board[dy][dx][ndy][ndx] = true;
        		board[ndy][ndx][dy][dx] = true;
        		answer++;
        	}
        }
        
        return answer;
    }
}

public class P3 {
	public static void main(String []args) {

		//System.out.println(Solution3.solution("ULURRDLLU"));
		//System.out.println(Solution3.solution("LULLLLLLU"));
		System.out.println(Solution3.solution("UUUUDUDUDUUU"));
	}
}
