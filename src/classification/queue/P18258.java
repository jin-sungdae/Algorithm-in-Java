package classification.queue;

import java.util.*;
import java.io.*;

public class P18258 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		StringTokenizer st2;
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int X = 0;
		for (int i = 0; i < N; i++) {
			st2 = new StringTokenizer(br.readLine());
			String str = st2.nextToken();
			if (str.contains("push")) {
				X = Integer.parseInt(st2.nextToken());
				queue.add(X);
			} else if (str.equals("pop")){
				if (queue.isEmpty()) {
					sb.append("-1");
				}else {
					sb.append(queue.poll());
				}
				sb.append("\n");
			} else if (str.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if (str.equals("empty")) {
				if (queue.isEmpty()) {
					sb.append("1");
				} else {
					sb.append("0");
				} sb.append("\n");
			} else if (str.equals("front")) {
				if (queue.isEmpty()) {
					sb.append("-1");
				} else {
					sb.append(queue.peek());
				}
				sb.append("\n");
			} else if (str.equals("back")) {
				if (queue.isEmpty()) {
					sb.append("-1");
				} else {
					sb.append(X);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
