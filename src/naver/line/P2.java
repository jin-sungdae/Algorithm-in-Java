package naver.line;

import java.util.*;


public class P2 {
	public static int solution(String[] sentences, int n) {
		int answer = -1;
		String [] arr = new String[sentences.length];
		for (int i = 0; i < sentences.length; i++) {
			for (int j = 0; j < sentences[i].length(); j++) {
				if (j == sentences[i].indexOf(sentences[i].charAt(j))) {
					arr[i] += sentences[i].charAt(i);
				} 
			}
			for (char x : sentences[i].toCharArray()) {
				if (x >= 65 && x <= 90) {
					arr[i] += '1';
					break;
				}
			}
		}for (int i = 0; i < sentences.length; i++) {
			
		}
		
		return answer;
	}
	
	public static void main(String []args) {
		String[] str = {"line in line" , "LINE", "in lion"};
		System.out.println(solution(str, 5));
	}
}
