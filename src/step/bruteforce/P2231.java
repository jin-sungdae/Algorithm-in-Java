package step.bruteforce;

import java.util.*;

public class P2231 {
	
	static int calc(int number) {
		int result = 0;
		int num = number;
		while (number != 0) {
			result += number % 10;
			number = number / 10;
		}
		return num + result;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if (N == calc(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
