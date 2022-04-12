package classification.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class P17608 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++){
            stack.add(Integer.parseInt(br.readLine()));
        }
        int K = stack.peek();
        int count = 1;
        for (int i = 0; i < N; i++){
            int temp = stack.pop();
            if (K < temp){
                K = temp;
                count++;
            }
        }
        System.out.println(count);
    }
}
