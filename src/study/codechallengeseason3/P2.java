package study.codechallengeseason3;

class Solution2 {
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int [(int)right - (int)left + 1];
        long j = left;
        for (int i = 0;  i < (int)(right - left + 1); i++) 
        	answer[i] = Math.max((int)(j % (long)n), (int)(j++ / (long)n)) + 1;
        return answer;
    }
}