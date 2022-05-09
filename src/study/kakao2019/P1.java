package study.kakao2019;

import java.util.*;

class Solution {
    public static String[] solution(String[] record) {

        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList();

        int findChangeCnt = 0;  
        for (String x : record) {
        	String [] splitRecord = x.split(" ");
        	if (x.contains("Change")) {

        		map.put(splitRecord[1], splitRecord[2]);

        	}
        	else if (x.contains("Enter")) {
   
        		map.put(splitRecord[1], splitRecord[2]);
        		arr.add(splitRecord[1] + "님이 들어왔습니다.");
  
        	} else if (x.contains("Leave")) {
   
        		arr.add(splitRecord[1] + "님이 나갔습니다.");

        	}

        }
        
        String [] result = new String[arr.size()];
        for (int t = 0; t < arr.size(); t++) {
        	String temp = "";
        	String [] splitRecord = arr.get(t).split(" ");
        	splitRecord[0]= splitRecord[0].replace("님이", "");

        	temp += map.get(splitRecord[0]);
        	temp += "님이 ";
        	temp += splitRecord[1];
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
