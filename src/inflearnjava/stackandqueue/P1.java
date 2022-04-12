package inflearnjava.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class P1 {

    public static String solution(String str){
        String result = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '(') stack.push(x);
            else{
                if (stack.isEmpty()) return result = "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return result = "NO";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
