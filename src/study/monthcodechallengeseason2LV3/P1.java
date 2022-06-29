package study.monthcodechallengeseason2LV3;

import java.util.*;

class Solution {
    public static String[] solution(String[] s) {
        String[] answer = new String[s.length];
        int j = 0;
        for (String x : s) {
            Stack<Character> st = new Stack<>();
            int cnt = 0;
            for (int i = 0; i < x.length(); i++) {
                st.push(x.charAt(i));
                if (st.size() >= 3) {
                    char first = st.pop();
                    if (first != '0') {
                        st.push(first);
                        continue;
                    }
                    char second = st.pop();
                    if (second != '1') {
                        st.push(second);
                        st.push(first);
                        continue;
                    }
                    char third = st.pop();
                    if (third != '1') {
                        st.push(third);
                        st.push(second);
                        st.push(first);
                        continue;
                    }
                    cnt++;
                }
            }
            StringBuilder sb = new StringBuilder();
            int pos = st.size();
            boolean ch = false;
            while (!st.isEmpty()) {
                char pop = st.pop();
                if (!ch && pop == '1') pos--;
                if (pop == '0') ch =true;
                sb.insert(0, pop);
            }
            for (int i = 0; i < cnt; i++) {
                sb.insert(pos, "110");
            }

            answer[j++] = sb.toString();

        }
        return answer;
    }
}

public class P1 {
    public static void main(String []args) {
        String[] s = {"1110","100111100","0111111010"};
        for (String x : Solution.solution(s))
            System.out.println(x);
    }
}