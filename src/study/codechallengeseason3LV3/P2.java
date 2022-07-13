package study.codechallengeseason3LV3;

class Solution2 {
    public static long solution(int n, int m, int x, int y, int[][] queries) {

        int x1 = x; int x2 = x;
        int y1 = y; int y2 = y;
        
        for (int i = queries.length - 1; 0 <= i; i--) {
        	if (queries[i][0] == 0) {
        		if (y1 != 0) 
        			y1 += queries[i][1];
        		y2 = y2 + queries[i][1] < m - 1 ? y2 + queries[i][1] : m - 1;
        		if (m < y1) return 0;
        	} else if (queries[i][0] == 1) {
        		if (y2 != m - 1)
        			y2 -= queries[i][1];
        		y1 = 0 < y1 - queries[i][1] ? y1 - queries[i][1] : 0;
        		if (y2 < 0) return 0;
        	} else if (queries[i][0] == 2) {
            	if (x1 != 0) 
            		x1 += queries[i][1];
            	x2 = x2 + queries[i][1] < n - 1 ? x2 + queries[i][1] : n - 1;
        	} else if (queries[i][0] == 3) {
        		if (x2 != n - 1)
        			x2 -= queries[i][1];
        		x1 = 0 < x1 - queries[i][1] ? x1 - queries[i][1] : 0;
        		if (x2 < 0) return 0;
        	}
        }
        
        long newX = x2 - x1 + 1;
        long newY = y2 - y1 + 1;
        	
        
        return newX * newY;
    }
}

public class P2 {
	public static void main(String[]args) {
		int [][] queries = {{2,1},{0,1},{1,1},{0,1},{2,1}};
		System.out.println(Solution2.solution(2, 2, 0, 0, queries));
	}

}
