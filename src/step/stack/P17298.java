package step.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298 {

    public static void solution(int [] list){
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.length; i++) {
            while (!stack.isEmpty() && list[stack.peek()] < list[i]){
                list[stack.pop()] = list[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            list[stack.pop()] = -1;
        }
        for (int x : list){
            sb.append(x).append(" ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int []list = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        solution(list);
    }
}
