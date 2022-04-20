package study.dp;

import java.util.*;

public class P14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] Ti = new int [n + 15];
        int [] Pi = new int [n + 15];
        int [] dy = new int [n + 15];
        for (int i = 1; i <= n; i++) {
        	Ti[i] = sc.nextInt();
        	Pi[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i <= n + 1; i++) {	
        	dy[i] = Math.max(dy[i], max);
        	max = Math.max(max, dy[i]);
        	dy[Ti[i] + i] = Math.max(dy[Ti[i] + i], Pi[i] + dy[i]);
        }
        System.out.println(max);
    }
}
