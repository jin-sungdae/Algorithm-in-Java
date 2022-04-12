package deque;

import java.util.*;
import java.io.*;

public class P10866 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int K = 0;
			if (str.contains("push_front")) {
				K = Integer.parseInt(st.nextToken());
				deque.offerFirst(K);
			} else if (str.contains("push_back")) {
				K = Integer.parseInt(st.nextToken());
				deque.offerLast(K);
			} else if (str.equals("pop_front")) {
				if (!deque.isEmpty()) {
					sb.append(deque.pollFirst());
				} else {
					sb.append("-1");
				} sb.append("\n");
			} else if (str.equals("pop_back")) {
				if (!deque.isEmpty()) {
					sb.append(deque.pollLast());
				} else {
					sb.append("-1");
				} sb.append("\n");
			} else if (str.equals("size")) {
				sb.append(deque.size()).append("\n");
			} else if (str.equals("empty")) {
				if (deque.isEmpty()) {
					sb.append("1");
				} else {
					sb.append("0");
				} sb.append("\n");
			} else if (str.equals("front")) {
				if (!deque.isEmpty()) {
					sb.append(deque.peekFirst());
				} else {
					sb.append("-1");
				} sb.append("\n");
			} else if (str.equals("back")) {
				if (!deque.isEmpty()) {
					sb.append(deque.peekLast());
				} else {
					sb.append("-1");
				} sb.append("\n");
			}
		}
		System.out.println(sb);
	}

}
