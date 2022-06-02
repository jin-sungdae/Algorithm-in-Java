package study.SummerWinterCoding2019;

import java.util.*;

class Solution3 {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String member = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
        	if (map.containsKey(words[i]) || i != 0 && member.charAt(member.length() - 2) != words[i].charAt(0)) {
        		answer[0] = i % n + 1;
        		answer[1] = i / n + 1;
        		break;
        	}
        	map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        	member += words[i] + " ";
        }
        return answer;
    }
}

public class P3 {
	public static void main(String []args) {
		String []words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		for (int x : Solution3.solution(3, words)) {
			System.out.print(x + " ");
		}
		
//		String []words1 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//		for (int x : Solution3.solution(5, words1)) {
//			System.out.print(x + " ");
//		}
//		
//		String []words2 = {"hello", "one", "even", "never", "now", "world", "draw"};
//		for (int x : Solution3.solution(2, words2)) {
//			System.out.print(x + " ");
//		}
		
//		String []words3 = {"land", "dream", "mom", "mom"};
//		for (int x : Solution3.solution(2, words3)) {
//			System.out.println(x + " ");
//		}
		
		
//		String [] words4 = {"qwe", "eqwe", "eqwe"};
//		for (int x : Solution3.solution(2, words4)) {
//			System.out
//		}
	}
}
