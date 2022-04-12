package inflearnjava.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class P2 {

    public static String solution(String str){
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == ')'){
                char tmp = stack.peek();
                while (tmp != '(') {
                    stack.pop();
                    tmp = stack.peek();
                }
                stack.pop();
            }
            else
                stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++){
            result += stack.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
