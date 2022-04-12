package inflearnjava.array;

import java.util.*;

public class P3 {
	
	public static void solution(int [] aList, int [] bList) {
		for (int i = 0; i < aList.length; i++) {
			if ((aList[i] == 1 && bList[i] == 3) || (aList[i] == 3 && bList[i] == 1)) {
				if (aList[i] == 1)
					System.out.println("A");
				else
					System.out.println("B");
			} else if (aList[i] < bList[i]) {
				System.out.println("B");
			} else if (aList[i] > bList[i]) {
				System.out.println("A");
			} else {
				System.out.println("D");
			}
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] aList = new int[N];
		int[] bList = new int[N];
		for (int i = 0; i < N; i++) {
			aList[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			bList[i] = sc.nextInt();
		}
		solution(aList, bList);
	}
}
