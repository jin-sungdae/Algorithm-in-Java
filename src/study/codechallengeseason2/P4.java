package study.codechallengeseason2;

class Solution4 {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int ch = 0, findZero = 0;
        while (!s.equals("1")) {
        	for (int i = 0; i < s.length(); i++) 
        		if (s.charAt(i) == '0') findZero++;
        	s = Integer.toBinaryString(s.replace("0", "").length());
        	ch++;
        }
        answer[0] = ch;
        answer[1] = findZero;
        return answer;
    }
}

public class P4 {
	public static void main(String []args) {
		for (int x : Solution4.solution("110010101001")) {
			System.out.println(x);
		}
	}
}
