package classification.queue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class P10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int Num;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String  str = st.nextToken();
            if (str.contains("push")){
                Num = Integer.parseInt(st.nextToken());
                queue.add(Num);
            } else if (str.equals("front")){
                if (queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (str.equals("pop")){
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else
                    sb.append(queue.poll()).append("\n");
            } else if (str.equals("size")){
                sb.append(queue.size()).append("\n");
            } else if (str.equals("empty")){
                if (queue.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (str.equals("back")) {
                if (!queue.isEmpty()){
                    Queue<Integer> temp = new LinkedList<>();
                temp.addAll(queue);
                while (temp.size() != 1) {
                    temp.remove();
                }
                sb.append(temp.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
