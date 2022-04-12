package inflearnjava.twopointers;

import java.util.*;

public class P1 {
	
	public static void solution(int [] nList, int []mList) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while (p1 < nList.length && p2 < mList.length) {
			if (nList[p1] < mList[p2]) answer.add(nList[p1++]);
			else answer.add(mList[p2++]);
		}
		while (p1 < nList.length) answer.add(nList[p1++]);
		while (p2 < mList.length) answer.add(mList[p2++]);
		for (int x : answer) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] nList = new int[N];
		for (int i = 0; i < N; i++) {
			nList[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int [] mList = new int[M];
		for (int i = 0; i < M; i++) {
			mList[i] = sc.nextInt();
		}
		solution(nList, mList);
	}
}
