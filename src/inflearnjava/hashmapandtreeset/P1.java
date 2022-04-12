package inflearnjava.hashmapandtreeset;

import java.util.*;

public class P1 {
	
	public static char solution(int n, String s) {
		char answer= ' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		int cnt = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			if (cnt < map.get(key)) {
				cnt = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(n, str));
	}
}
