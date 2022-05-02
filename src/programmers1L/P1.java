package programmers1L;

class Solution {
	static int []dx = {-1, 0, 1, 0};
	static int []dy = {0, -1, 0, 1};
    public static String solution(int[] numbers, String hand) {
    	int [][] phone = {{1,2,3},{4,5,6},{7,8,9},{99,0,100}};
        String answer = "";
        int num = 99;
        int lNum = 0;
        int rNum = 0;
        int iLC = 0;
        int jLC = 0;
        int iRC = 0;
        int jRC = 0;
        int cnt = Integer.MIN_VALUE;
        int t, y = 0;
        for (int x : numbers) {
        	t= 0; y = 0;
        	if (x == 1 || x == 4 || x == 7) {
        		answer += "L";
        		lNum = x;
        	}
        	else if (x == 3 || x == 6 || x == 9) {
        		answer += "R";
        		rNum = x;
        	}
        	else if (x == 2 || x == 5 || x == 8 || x == 0) {
        		for (int i = 0; i < 4; i++) {
        			for (int j = 0; j < 3; j++) {
        				if (phone[i][j] == lNum) {
        					iLC = i;
        					jLC	= j;
        				}
        				if (phone[i][j] == rNum) {
        					iRC = i;
        					jRC = j;
        				}
        			}
        		}
        		jLC +=1;
        		int LeftNum = phone[iLC][jLC];
        		//System.out.println(LeftNum);
        		while (LeftNum != x) {
        			if (phone[++iLC][jLC] > x) {
        				LeftNum = phone[iLC][jLC];
        				t++;
        			} else if (phone[--iLC][jLC] < x){
        				LeftNum = phone[iLC][jLC];
        				t++;
        			}
        		}
        		System.out.println(t);
        	}
        	num = x;
        }
        return answer;
    }
}

public class P1 {
	public static void main(String []args) {
		int []num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(Solution.solution(num, "right"));
	}
}
