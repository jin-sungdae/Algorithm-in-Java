package classification.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #" + (i + 1) + ": ");
            int n =  st.countTokens();
            for (int j = 0; j < n; j++){
                stack.add(st.nextToken());
            }

            for (int j = 0; j < n; j++){
                sb.append(stack.pop() + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
