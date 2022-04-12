package inflearnjava.hashmapandtreeset;

import java.util.*;

public class P5 {
	
	public static int solution(int [] arr, int n, int k) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n ; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int t = j + 1; t < n; t++) {
					Tset.add(arr[i] + arr[j] + arr[t]);
				}
			}
		}
		for (int x : Tset) {
			k--;
			if (k == 0) {
				answer = x;
			}
		}
			
		
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr, n, k));
	}
}
