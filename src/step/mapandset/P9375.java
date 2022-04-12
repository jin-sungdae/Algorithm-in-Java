package step.mapandset;

import java.util.*;

public class P9375 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void solution(int s, HashMap<String, Integer> map) {
		int result = 1;
		for (String x : map.keySet()) {
			result *= map.get(x) + 1;
		}
		sb.append(result - 1).append("\n");
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		int n = sc.nextInt();
		HashMap<String, Integer> map;
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			map = new HashMap<>();
			for (int j = 0; j < s; j++) {
				a = sc.next();
				b = sc.next();
				map.put(b, map.getOrDefault(b, 0) + 1);
			}
			
			solution(s, map);
		}
		System.out.println(sb);
	}
}
