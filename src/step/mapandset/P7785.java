package step.mapandset;

import java.util.*;

public class P7785 {
	
	public static void solution(TreeMap<String, Integer> map) {
		
	

		StringBuilder sb = new StringBuilder();
		for (String x : map.descendingKeySet()) {
			sb.append(x).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s1 = sc.next();
			String s2 = sc.next();
			if (s2.equals("enter"))
				map.put(s1, map.getOrDefault(s1, 0) + 1);
			else if (s2.equals("leave"))
				map.remove(s1);
		}
		solution(map);
		
	}
}
