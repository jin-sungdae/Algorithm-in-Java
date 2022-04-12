package classification.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N ; i++){
            queue.add(i);
        }
        sb.append("<");
        int i = 1;

        while (!queue.isEmpty()){
            int temp = queue.poll();
            if (i == K){
                sb.append(temp).append(", ");
                i = 0;
            } else
                queue.add(temp);
            i++;
        }
        sb.replace(sb.length() - 2, sb.length(), ">");
        System.out.println(sb);
    }
}
