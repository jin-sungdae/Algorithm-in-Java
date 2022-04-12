package deque;

import java.util.*;
import java.io.*;

public class P1021 {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int []list = new int[K];
		LinkedList<Integer> deque = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		
		}
		
		int count = 0;
		int tempt = 0;
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			list[i] = Integer.parseInt(st2.nextToken());	
		}
	
		for (int i = 0; i < K; i++) {
			int index = deque.indexOf(list[i]);
			int halfIndex;
			
			if (deque.size() % 2 == 0) {
				halfIndex = deque.size() / 2 - 1;
			} else {
				halfIndex = deque.size() / 2;
			}
			
			if (index <= halfIndex) {
				for (int j = 0; j < index; j++) {
					tempt = deque.pollFirst();
					deque.offerLast(tempt);
					count++;
				}
			} else {
				for (int j = 0; j < deque.size() - index; j++) {
					tempt = deque.pollLast();
					deque.offerFirst(tempt);
					count++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(count);
	}
}
