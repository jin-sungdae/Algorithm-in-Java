package leetcode;

class Solution2 {
    public static int test(String s) {
        int big = 1;
        int len = 0;
        int sLen = 0;
        for (int i = 0; i < s.length(); i++){
            len = 1;
            for (int j = i + 1; j < s.length(); j++){
                String tmp = s.substring(i, j);
                System.out.println(tmp + " " + s.charAt(j) + " : len = " + len);
                if (tmp.contains(s.charAt(j) + "")) {
                    break;
                }
                len++;

            }

            big = Math.max(big,len);
            System.out.println("big = " +  big);
        }
        return big;
    }
}

public class LongestSubstringWithoutRepeatCharacters {
    public static void main(String[] args) {
        System.out.println(Solution2.test("pwwkew"));
    }
}
