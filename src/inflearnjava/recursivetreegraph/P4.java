package inflearnjava.recursivetreegraph;

import java.util.*;

public class P4 {
	public static int [] fibo;
	public static int solution(int N) {
		if (fibo[N] > 0) {
			return fibo[N];
		} else {
			if (N == 1) return fibo[N] = 1;
			else if (N == 2) return fibo[N] = 1;
			else return fibo[N] = solution(N - 2) + solution(N - 1);
		}
	}
	
	public static void main(String []args) {
	
		fibo = new int[45 + 1];
		solution(45);
		for (int i = 1; i <= 45; i++) {
			System.out.print(fibo[i] + " ");
		}
		
	}
}
