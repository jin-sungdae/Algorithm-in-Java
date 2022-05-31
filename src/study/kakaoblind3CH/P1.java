package study.kakaoblind3CH;

import java.util.*;


class Solution {
    public static String[] solution(String[] files) {
    	
    	
    	Arrays.sort(files, new Comparator<String>() {
    		@Override
    		public int compare(String o1, String o2) {
    			
    			String head1 = o1.split("[0-9]")[0];
    			System.out.println(head1);
    			String head2 = o2.split("[0-9]")[0];
    			int result = head1.toLowerCase().compareTo(head2.toLowerCase());
    			if (result ==0) {
    				result = convertNum(o1, head1) - convertNum(o2, head2);
    			}
    			return result;
    		}
    	});
    	
    	return files;
    }
    public static int convertNum(String str, String head) {
    	str = str.substring(head.length());
    	String result = "";
    	for (char c : str.toCharArray()) {
    		if (Character.isDigit(c) && result.length() < 5) {
    			result += c;
    		}
    		else
    			break;
    	}
    	return Integer.valueOf(result);
    }
}

public class P1 {
	public static void main(String []args) {
		String [] files = {"foo9.txt","foo010bar020.zip","F-15", "muzi1.TXT"};
		for (String x : Solution.solution(files)) {
			System.out.println(x);
		}
	}
}
