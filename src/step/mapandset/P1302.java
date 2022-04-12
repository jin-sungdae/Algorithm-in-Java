package step.mapandset;

import java.util.*;

public class P1302 {
	
	public static String solution(TreeMap<String, Integer> map) {
		String result = "";
		
		int max = Integer.MIN_VALUE;
		
		for (String x : map.keySet()) {
			if (max < map.get(x)) {
				max = map.get(x);
				result = x;
			}
		}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		System.out.println(solution(map));
	}
}
