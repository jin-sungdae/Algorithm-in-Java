package study.kakao2019;

import java.util.*;

class Solution3 {
    public static int solution(String str1, String str2) {
        double answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        List<String> str1ArrayList = new ArrayList<>();
        List<String> str2ArrayList = new ArrayList<>();
        List<String> UnionArrayList = new ArrayList<>();
        List<String> IntersectionArrayList = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
        	
        	char first = str1.charAt(i);
        	char second = str1.charAt(i + 1);
        	if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
        		str1ArrayList.add(first + "" + second);
       
        	}
        }
        for (int i = 0; i < str2.length() - 1; i++) {
        	char first = str2.charAt(i);
        	char second = str2.charAt(i + 1);
        	if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
        		str2ArrayList.add(first + "" + second);

        	}
        }
        
        Collections.sort(str1ArrayList);
        Collections.sort(str2ArrayList);
        for (String x : str1ArrayList) {
        	if (str2ArrayList.remove(x)) IntersectionArrayList.add(x);
        	UnionArrayList.add(x);
        }
        for (String x : str2ArrayList) {
        	UnionArrayList.add(x);
        }
        System.out.println(UnionArrayList.size() + " : " + IntersectionArrayList.size());
        if (UnionArrayList.size() == 0) answer = 65536;
        else answer = ((double)IntersectionArrayList.size() / (double)UnionArrayList.size()) * 65536;
        
       

        return (int)answer;
    }
}

public class P3 {
	public static void main(String []args) {
		System.out.println(Solution3.solution("aa1+aa2", "AAAA12"));
	}
}
