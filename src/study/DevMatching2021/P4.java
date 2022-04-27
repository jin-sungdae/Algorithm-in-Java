package study.DevMatching2021;

import java.util.*;

class Solution4 {
	static int [] alpa ;
	static HashMap<String, Integer> map;
	
	public static void combi(String str, StringBuilder sb, int idx, int cnt, int n) {
		if (cnt == n) {
			map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
			return ;
		}
		for (int i = idx; i < str.length(); i++) {
			sb.append(str.charAt(i));
			combi(str, sb, i + 1, cnt + 1, n);
			sb.delete(cnt,  cnt + 1);
		}
	}
	
    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i =0;i<orders.length;i++){
            // 2. 각 문자열을 문자형 배열로 변환.
            char[] charArr = orders[i].toCharArray();
            // 3. 해당 문자형 배열을 정렬.
            Arrays.sort(charArr);
            // 4. 정렬된 문자형 배열을 문자열로 변환해 저장.
            orders[i] = String.valueOf(charArr);
        }
        for (int i = 0; i < course.length; i++) {
        	map = new HashMap<>();
        	int max = Integer.MIN_VALUE;
        	for (int j = 0; j < orders.length; j++) {
        		StringBuilder sb = new StringBuilder();
        		if (course[i] <= orders[j].length())
        			combi(orders[j], sb, 0, 0, course[i]);
        	}
        	for (String x : map.keySet()) {
        		System.out.print(" "+ x + " : " + map.get(x) );
        	}
        	System.out.println();
        	for (String x : map.keySet())
        			max =Math.max(max, map.get(x));
        	for (String x : map.keySet()) {
        		if (max >= 2 && map.get(x) == max) {
        			arr.add(x);
        		}
        	}
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        int i = 0;
        for (String x : arr) {
        	answer[i++] = x;
        }
        return answer;
    
}
}


public class P4 {
	public static void main(String []args) {
		String [] orders = {"XYZ", "XWY", "WXA"};
		int [] course = {2,3,4};
		for (String x :Solution4.solution(orders, course) ) {
			System.out.print(x + " ");
		}
		

	}
}
