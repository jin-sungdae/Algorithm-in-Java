package inflearnjava.twopointers;

import java.util.*;

public class P2 {
	
	public static void solution(int []nList, int []mList) {
		Arrays.sort(nList);
		Arrays.sort(mList);
		
		int p1 = 0, p2 = 0;
		ArrayList<Integer> result = new ArrayList<>();
		while (p1 < nList.length && p2 < mList.length) {
			if (nList[p1] == mList[p2]) {
				result.add(nList[p1]);
				p1++;
				p2++;
			} else if (nList[p1] > mList[p2])
				p2++;
			else p1++;
		}
		
		
		for (int x : result) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []nList = new int[N];
		for (int i = 0; i < N; i++) {
			nList[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int []mList = new int[M];
		for (int i = 0; i < M; i++) {
			mList[i] = sc.nextInt();
		}
		
		solution(nList, mList);
	}
}
