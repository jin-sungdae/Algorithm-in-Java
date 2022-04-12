package inflearnjava.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P7 {

    public static String solution(String str1, String s2){
        String result = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x : str1.toCharArray()){
            q.add(x);
        }
        for (char x : s2.toCharArray()){
            if (q.contains(x)){
                if (x != q.poll()) return result = "NO";
            }
        }
        if (!q.isEmpty()) result = "NO";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
