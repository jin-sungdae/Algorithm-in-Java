package combi;

import java.util.*;

public class P2004 {
	
	static long fiveN(long n) {
		int count = 0;
		while (n >= 5) {
			count += n / 5;
			n /= 5;
		}
		return count;
	}
	
	static long twoN(long n) {
		int count = 0;
		while (n >= 2) {
			count += n / 2;
			n /= 2;
		}
		return count;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		
		long count5 = fiveN(n) - fiveN(n - m) - fiveN(m);
		long count2 = twoN(n) - twoN(n - m) - twoN(m);
		
		System.out.println(Math.min(count5, count2));
	}
}
