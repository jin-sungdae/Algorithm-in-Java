package study.DevMatching2021;

class Solution3 {
    public static String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        answer = new_id.replaceAll("[^a-z0-9-._]", "");

//        while (answer.indexOf("..") > -1)
//        	answer = answer.replace("..", ".");
        for (int i = 0 ; i < answer.length() + 10; i++) {
        	answer = answer.replace("..", ".");
        }
        System.out.println(answer);

        if (answer.length() != 0) {
            if (answer.charAt(0) == '.' && answer.length() > 1)
                answer = answer.substring(1);
            if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.')
                answer = answer.substring(0, answer.length() - 1);
        }
//        System.out.println(answer);
         if (answer.length() == 1 && answer.charAt(0) == '.')
             answer = "";
        System.out.println(answer);

        if (answer.length() == 0) 
        	answer = "a";
        if (answer.length() >= 16) {
        	answer = answer.substring(0, 15);
        	if (answer.charAt(14) == '.')
            	answer = answer.substring(0, 14);
            
        }
        while (answer.length() < 3)
            answer += answer.charAt(answer.length() - 1);
        return answer;
    }
}
public class P3 {
	public static void main(String []args) {
		String str = "................b";
		System.out.println(str.length());
		//System.out.println(Solution3.solution("=.="));
		System.out.println(Solution3.solution("................b"));
	
	}
}
