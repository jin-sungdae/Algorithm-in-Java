package step.mapandset;

import java.util.*;

public class P2910 {
	
	public static void solution(TreeMap<Integer, Integer> map) {
		StringBuilder sb = new StringBuilder();
		int [] list = new int[2];
		ArrayList<int []> arr = new ArrayList<>();
		int i = 0;
		for (Integer x : map.keySet()){
			int tmp = map.get(x);
			//arr.put();
		}
		System.out.println(sb);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num <= C) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
		solution(map);
	}
}
