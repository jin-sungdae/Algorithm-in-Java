package classification.stack;

import java.util.*;
import java.io.*;

public class P10828 {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2;
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st2 = new StringTokenizer(br.readLine());
			String str = st2.nextToken();
			if (str.contains("push")) {
				int X = Integer.parseInt(st2.nextToken());
				stack.add(X);
			} else if (str.equals("pop")) {
				if (stack.isEmpty()) {
					sb.append("-1");
				} else {
					sb.append(stack.pop());
				} sb.append("\n");
			} else if (str.equals("size")) {
				sb.append(stack.size()).append("\n");
			} else if (str.equals("empty")) {
				if (stack.isEmpty()) {
					sb.append("1");
				} else {
					sb.append("0");
				} sb.append("\n");
			} else if (str.equals("top")) {
				if (stack.isEmpty()) {
					sb.append("-1");
				} else {
					sb.append(stack.peek());
				} sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
