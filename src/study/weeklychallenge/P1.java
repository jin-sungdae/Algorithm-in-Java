package study.weeklychallenge;

class Solution {
	static int answer;
	static boolean[] isVisit;
    public static int solution(int k, int[][] dungeons) {
        
    	isVisit = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        
        return answer;
    }
    
    public static void dfs(int [][] dungeons, int k, int depth) {
    	for (int i = 0; i < dungeons.length; i++) {
    		if (!isVisit[i] && dungeons[i][0] <= k) {
    			isVisit[i] = true;
    			dfs(dungeons, k - dungeons[i][1], depth + 1);
    			isVisit[i] = false;
    		}
    	}
    	answer = Math.max(answer, depth);
    }
}

public class P1 {
	public static void main(String []args) {
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		System.out.println(Solution.solution(80,dungeons));
	}
}
