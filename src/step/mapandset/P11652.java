package step.mapandset;

import java.util.*;

public class P11652 {
	
	public static Long solution(TreeMap<Long, Integer> map) {

		Long result = 0L;
		Integer max = 0;
		for (Long x : map.keySet()) {
			if (max < map.get(x)) {
				max = map.get(x);
				result = x;
			}
		}
		return result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Long, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			Long s = sc.nextLong();
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		System.out.println(solution(map));
	}
}
