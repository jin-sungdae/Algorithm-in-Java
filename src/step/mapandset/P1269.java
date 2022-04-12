package step.mapandset;

import java.util.*;

public class P1269 {
	
	public static int solution(HashMap<Integer, Integer> aList, HashMap<Integer, Integer> bList) {
		int answer = 0;
		int tmp = 0;
		for (Integer x : aList.keySet()) {
			if (bList.containsKey(x)) {
				tmp++;
			}
		}
		answer += aList.size() - tmp;
		
		tmp = 0;
		for (Integer x : bList.keySet()) {
			if (aList.containsKey(x)) {
				tmp++;
			}
		}
		answer += bList.size() - tmp;
		
		return answer;
	}
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		HashMap<Integer, Integer> aList = new HashMap<>();
		HashMap<Integer, Integer> bList = new HashMap<>();
		for (int i = 0; i < a; i++) {
			int n = sc.nextInt();
			aList.put(n, aList.getOrDefault(n, 0) + 1);
		}
		for (int i = 0; i < b; i++) {
			int m = sc.nextInt();
			bList.put(m, bList.getOrDefault(m, 0) + 1);
		}
		System.out.println(solution(aList, bList));
	}
}
