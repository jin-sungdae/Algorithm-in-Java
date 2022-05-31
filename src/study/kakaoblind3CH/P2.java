package study.kakaoblind3CH;

class Solution2 {
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        String tmp = "";
        for (int i = 1; i <= t * m; i++) 
        	tmp += Integer.toString(i - 1, n).toUpperCase();
        tmp = tmp.substring(0, t * m);
        for (int i = p - 1; i < m * t; i = i + m)
        	answer += tmp.charAt(i);
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		System.out.println(Solution2.solution(2, 4, 2, 1));
	}
}
