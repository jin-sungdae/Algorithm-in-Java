package step.math;

import java.util.Scanner;

public class P1002 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
 
		int T = in.nextInt();
 
		while (T-- > 0) {
 
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
 
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			
			System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
		}
 
	}
 
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
    
		int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// 중점간 거리 distance의 제곱 
 
 
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		else if(distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		else if(distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		else if(distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		
		else if(distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
		
	}
 
}
