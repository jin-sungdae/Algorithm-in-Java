package step.mapandset;

import java.util.*;

public class P16165 {
	static StringBuilder sb = new StringBuilder();
	static TreeMap<String, String> map = new TreeMap<>();
	
	public static void solution(String numberName, int ch) {
		if (ch == 1)
			sb.append(map.get(numberName)).append("\n");
		else {
			String str = "";
			for (String x : map.keySet()) {
				if (map.get(x).equals(numberName)) {
					str = x;
					sb.append(str).append("\n");
				}
			}		
		}
	
	}
	
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				String numberName = sc.next();
				map.put(numberName, str);
			}
		}
		for (int i = 0; i < m; i++) {
			String numberName = sc.next();
			int ch = sc.nextInt();
			solution(numberName, ch);
		}
		System.out.println(sb);
	}
}
