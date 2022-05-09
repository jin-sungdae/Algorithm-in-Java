package study.kakao2019;

import java.util.*;

class Solution2 {
    public static int solution(String[][] relation) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < relation.length; i++) {
        	map.put(relation[i][0], map.getOrDefault(relation[i][0], 0) + 1);
        }
        boolean ch = true;
        for (String x : map.keySet()) {
        	if (map.get(x) != 1) {
        		ch = false;
        		break;
        	}
        }
        if (ch == true) answer++;
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		String [][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"}, {"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		System.out.println(Solution2.solution(relation));
	}
}
