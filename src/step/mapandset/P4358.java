package step.mapandset;

import java.util.*;
import java.io.*;
public class P4358 {
	public static void solution(TreeMap<String, Integer> map, int all) {
		StringBuilder sb = new StringBuilder();
		for (String s : map.keySet()) {
			int tmp = map.get(s);
			double d = (double)(tmp * 100.0) / (double)all;
			String str = String.format("%.4f", d);
			sb.append(s + " " + str + "\n");
		}
		
		System.out.println(sb);
	}
	
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int all = 0;
		TreeMap<String, Integer> map = new TreeMap<>();
		String str = br.readLine();
		while(true) {
			map.put(str, map.getOrDefault(str, 0) + 1);
			all++;
			str = br.readLine();
			if(str == null || str.length() == 0) {
				break;
			}
		}
		solution(map, all);
	}
}
