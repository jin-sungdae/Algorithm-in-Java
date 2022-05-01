package study.kakao2021blind;


class Solution2 {
    public static int solution(String s) {
        int answer = s.length();
        for (int i = 1; i < s.length(); i++){
            int L = 1;
            String str = s.substring(0, i);
            String exampleStr = "";
            for (int j = i; j <= s.length(); j += i){
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                if (str.equals(next)) L++;
                else {
                    if (L != 1){
                        exampleStr += L;
                        exampleStr += str;
                    }else {
                        exampleStr += "";
                        exampleStr += str;
                    }
                    str = next;
                    L = 1;
                }
            }
            exampleStr += str;
            answer = Math.min(answer, exampleStr.length());
        }
        return answer;
    }
}

public class P2 {
    public static void main(String[] args) {
        System.out.println(Solution2.solution("aabbaccc"));
    }
}
