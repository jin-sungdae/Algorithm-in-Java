package study.programmers2022kakaoblind;

import java.util.*;


class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, String> set = new HashMap<>();
        HashMap<String, Integer> reportId = new HashMap<>();
        HashMap<String, Integer> stopId = new HashMap<>();
        
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        report = hashSet.toArray(new String[0]);
        for (String s : report) {
        	String[] reportSplit;
        	reportSplit = s.split(" ");
        	set.put(reportSplit[0], set.getOrDefault(reportSplit[0], "") + " "+ reportSplit[1] + " ");
        	reportId.put(reportSplit[1], reportId.getOrDefault(reportSplit[1], 0) + 1);
        	

        }
        
        for (String x : set.keySet()) {
        	System.out.println(x + ":" + set.get(x));
    
        }
        
        System.out.println("======== reportId =====");
        for (String x : reportId.keySet()) {
        	System.out.println(x + " : " + reportId.get(x));
    
        }

        System.out.println("========");
        for (String x : reportId.keySet()) {
        	if (reportId.get(x) >= k) {
        		for (String s : set.keySet()) {
        			
        				if (set.get(s).contains(x))	stopId.put(s, stopId.getOrDefault(s, 0) + 1);
        			
                }
        	}
        }
        
        System.out.println("========");
        for (String x : stopId.keySet()) {
        	System.out.println(x + " : " + stopId.get(x));
    
        }
        
        for (String x : stopId.keySet()) {
        	for (int i = 0; i < id_list.length; i++) {
        		if (id_list[i].equals(x)) {
        			answer[i] = stopId.get(x);
        			break;
        		}
        	}
        }

        return answer;
    }
}

public class P1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		String [] id_list = {"muzi", "frodo", "apeach", "neo"};
		String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		for (int x : Solution.solution(id_list, report, k)) {
			System.out.println(x);
		}
	}
}
