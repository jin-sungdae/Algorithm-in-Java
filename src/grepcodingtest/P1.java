package grepcodingtest;

import java.util.*;

class Solution {

    public 	static String solution(int n, String text, int second) {
		String answer = "";
		String temp = "";
		text = text.replaceAll(" ", "_");

			for (int i = 0; i < n; i++)
				temp += "_";

		temp = temp.concat(text);

		for (int i = 0; i < second; i++) {
			char tmp = temp.charAt(0);
			temp += tmp;
			temp = temp.substring(1);
		}

		answer = temp.substring(0, n);
		return answer;
	}
}




public class P1 {
	public static void main(String []args) {

		for (int i = 1; i < 1000; i++)
			System.out.println(Solution.solution(7, "abaadf", i));
	}
}
