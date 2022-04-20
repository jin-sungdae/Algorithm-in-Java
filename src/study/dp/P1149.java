package study.dp;

import java.util.*;

public class P1149 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]rgb = new int [n + 1][3];
		for (int i = 1; i <= n; i++) {
			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();
			rgb[i][0] = Math.min(rgb[i - 1][1], rgb[i - 1][2]) + r;
			rgb[i][1] = Math.min(rgb[i - 1][0], rgb[i - 1][2]) + g;
			rgb[i][2] = Math.min(rgb[i - 1][0], rgb[i - 1][1]) + b;
		}
		System.out.println(Math.min(rgb[n][2], Math.min(rgb[n][0], rgb[n][1])));		
	}
}
