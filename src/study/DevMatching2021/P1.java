package study.DevMatching2021;

class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int resultCnt = 0, ch = 0;
        for (int x : win_nums) {
        	for (int y : lottos) {
        		if (x == y) resultCnt++;
        	}
        }
        for (int y : lottos) {
        	if (y == 0) ch++; 
        }
        if (ch == 6) answer[1] = 6;
        else answer[1] = 7 - resultCnt;
        answer[0] = 7 - (resultCnt + ch);
        if (resultCnt == 0 && ch == 0) {
        	answer[0] = 6;
        	answer[1] = 6;
        }
        return answer;
    }
}

public class P1 {
	public static void main(String []args) {
		int [] lottos = {1,2,3,4,5,6};
		int [] win_nums = {7,8,9,10,11,12};
		for (int x : Solution.solution(lottos, win_nums)) {
			System.out.print(x + " ");
		}
	}
}
