package classification.stack;

import java.util.*;
import java.io.*;

public class P10773 {
	public static void main(String []args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < K; i++) {
			int N = sc.nextInt();
			if (N == 0) {
				int J = stack.pop();
			} else {
				stack.push(N);
			}
		}
		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
}
