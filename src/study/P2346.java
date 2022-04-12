package study;

import java.util.*;

public class P2346 {
	
	public static int[] solution(int [] numList) {
		Deque<int []> list = new ArrayDeque<>();
		int []result = new int[numList.length];
		result[0] = 1;
		int temp = numList[0];
		for (int i = 1; i < numList.length; i++) {
			list.add(new int[] {(i + 1), numList[i]});
		}
		int z = 1;
		while (!list.isEmpty()) {
			if (temp > 0) {
				for (int i = 1; i < temp; i++) {
					list.add(list.pollFirst());
				}
				int [] arr = list.poll();
				temp = arr[1];
				result[z] = arr[0];
				z++;
			} else {
				for (int i = 1; i < -temp; i++) {
					list.addFirst(list.pollLast());
				}
				int [] arr = list.pollLast();
				temp = arr[1];
				result[z] = arr[0];
				z++;
			}
		}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int []numList = new int[N];
		for (int i = 0; i < N; i++) {
			numList[i] = sc.nextInt();
		}
		
		for (int x : solution(numList)) {
			System.out.print(x + " ");
		}
	}
}
