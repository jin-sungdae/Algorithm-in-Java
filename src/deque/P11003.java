package deque;

import java.util.*;
import java.io.*;
public class P11003 {	
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		Deque<int []> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			while (!deque.isEmpty() && deque.peekLast()[0] > temp) {deque.removeLast();}
			deque.addLast(new int[] {temp, i});
			if (deque.getFirst()[1] <= i - K) deque.removeFirst();
			sb.append(deque.getFirst()[0] + " ");
		}
		System.out.println(sb);
	}
}
