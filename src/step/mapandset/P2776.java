package step.mapandset;

import java.util.*;

public class P2776 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < n; j++) {
				int s1 = sc.nextInt();
				map.put(s1, map.getOrDefault(s1, 0) + 1);
			}
			int m = sc.nextInt();
			for (int t = 0; t < m; t++) {
				int s2 = sc.nextInt();
				if (map.containsKey(s2)) {
					map.put(s2, map.get(s2) - 1);
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
