package study.summerandwintercoding2018;

class Solution2 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String x : skill_trees) {
        	String temp = x;
        	String temp2 = x;
        	String []split = skill.split("");
        	boolean ch = false;
        	for (String c : split) {
        		temp = temp.replace(c, "");
        	}
        	String []nonSkill = temp.split("");
        	for (String t : nonSkill) {
        		temp2 = temp2.replace(t, "");
        	}
        	
        	for (int i = 0; i < temp2.length(); i++) {
        		if (skill.charAt(i) != temp2.charAt(i)) {
        			ch = true;
        			break;
        		}
        	}
        	if (ch == false)answer++;
        	

        }
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(Solution2.solution("CBD", skill_trees));
	}
}
