package inflearnjava.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P6 {

    public static int solution(int n, int k){
        int result = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            q.add(i);
        }
        while (q.size() != 1){
            for (int i = 0; i < k - 1; i++){
                int temp = q.poll();
                q.add(temp);
            }
            q.poll();
        }
        result = q.poll();
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }
}
