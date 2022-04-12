package classification.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++){
            queue.add(i);
        }
        int cnt = 1;
        int temp;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (queue.size() != 1){
            temp = queue.remove();
            if (cnt == K){
                sb.append(temp).append(", ");
                cnt = 1;
            } else {
                cnt++;
                queue.add(temp);
            }
        }
        sb.append(queue.remove()).append(">");
        System.out.println(sb);
    }
}
