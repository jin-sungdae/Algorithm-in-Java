package summercoding;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int x;
    int y;
    Node (int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution3 {
    public static int[] solution(String line) {
        int[] answer = new int[line.length()];
        char [][] chars = {{'1','2','3','4','5','6','7','8','9','0'}, {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I' ,'O', 'P'}};

        Node left = new Node(1, 0);
        Node right = new Node(1, 9);
        Queue<Node> q = new LinkedList<>();
        for (Character c : line.toCharArray()){
            int i = 0;
            int j = 0;
            if (c >= 48 && c <= 57){
                while (chars[0][i] != c){
                    i++;
                }
                j = 0;
            }
           else {
                while (chars[1][i] != c) {
                    i++;
                }
                j = 1;
            }
            q.add(new Node(j, i));

        }



        int cnt = 0;
        while (!q.isEmpty()){
            Node temp = q.poll();

            int diff = (Math.abs(temp.x - left.x) + Math.abs(temp.y - left.y)) - (Math.abs(temp.x - right.x)  + Math.abs(temp.y - right.y));
            int vertical = Math.abs(temp.y - left.y) - Math.abs(temp.y - right.y);
            if (diff < 0){
                answer[cnt++] = 0;
                left = temp;
            } else if (diff > 0){
                answer[cnt++] = 1;
                right = temp;
            } else {
                if (vertical < 0){
                    answer[cnt++] = 0;
                    left = temp;
                } else if (vertical > 0){
                    answer[cnt++] = 1;
                    right = temp;
                } else {
                    if (temp.y > 4) {
                        answer[cnt++] = 1;
                        right = temp;
                    } else {
                        answer[cnt++] = 0;
                        left = temp;
                    }
                }
            }
        }
        return answer;
    }
}

public class P3 {
    public static void main(String[] args) {
        String line = "Q4OYPI";
        for (int x : Solution3.solution(line)) {
            System.out.println(x);
        }
    }
}
