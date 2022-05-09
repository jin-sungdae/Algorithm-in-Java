package study.kakao2019;

import java.util.*;

class Solution {
    public static String[] solution(String[] record) {
        String[] answer = new String[record.length];
        HashMap<String, String> map = new HashMap<>();
        
        int findChangeCnt = 0;
        
        for (String x : record) {
        	if (x.contains("Change")) {
        		String [] splitRecord = x.split(" ");
        		map.put(splitRecord[1], splitRecord[2]);
        	} else findChangeCnt++;
        	if (x.contains("Enter")) {
        		String [] splitRecord = x.split(" ");
        		map.put(splitRecord[1], splitRecord[2]);
        	}
        }
        
        int i = 0;
        for (String x : record) {
        	String [] splitRecord = x.split(" ");
        	if (map.containsKey(splitRecord[1]) && !splitRecord[0].equals("Leave")) {	
        			x = x.replace(splitRecord[2], map.get(splitRecord[1]));
        	}
        	answer[i++] = x;
        }
        
        String [] result = new String[findChangeCnt];
        for (int t = 0; t < findChangeCnt; t++) {
        	String temp = "";
        	String [] splitRecord = answer[t].split(" ");
        	if (answer[t].contains("Enter")) {
        		temp += map.get(splitRecord[1]);
        		temp += "님이 들어왔습니다.";
        	} else if (answer[t].contains("Leave")) {
        		temp += map.get(splitRecord[1]);
        		temp += "님이 나갔습니다.";
        	}
        	result[t] = temp;
        }
        
        return result;
    }
}

public class P1 {
	public static void main(String []args) {
		String []  record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		for (String x : Solution.solution(record)) {
			System.out.println(x);
		}
	}
}
