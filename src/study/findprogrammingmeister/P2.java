package study.findprogrammingmeister;

//class Solution2
//{
//    public static int solution(String s)
//    {
//        for (int i = 1; i < s.length(); i++) {
//        	if (s.charAt(i) == s.charAt(i - 1)) {
//        		String tmp = s.substring(0, i - 1);
//        		String tmp2 = s.substring(i + 1);
//        		s = tmp + tmp2;
//        		i = 0;
//        	}
//        }
//        
//        System.out.println(s);
//        
//        if (s.length() == 0)
//        	return 1;
//        return 0;
//    }
//}

import java.util.*;

class Solution2
{
    public static int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        System.out.println(stack.peek());
        for (int i = 1; i < s.length(); i++) {
        	if (!stack.isEmpty() && stack.peek().equals(s.charAt(i))) {
        		stack.pop();
        	} else 
        		stack.push(s.charAt(i));
        }
        if (stack.isEmpty()) return 1;
        return 0;
    }
}

public class P2 {
	public static void main(String []args) {
		System.out.println(Solution2.solution("baabaa"));
	}
}
