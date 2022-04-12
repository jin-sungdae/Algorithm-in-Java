package step.mapandset;

import java.util.*;

public class P14425 {
	
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<String, Integer> list = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			list.put(s, list.getOrDefault(s, 0) + 1);
		}
		int answer = 0;
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			if (list.containsKey(s)) answer++;
		}
		System.out.println(answer);
	}
}
