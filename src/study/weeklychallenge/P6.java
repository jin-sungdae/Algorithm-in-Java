package study.weeklychallenge;

import java.util.*;

class Solution6 {
    public static int solution(int[][] sizes) {
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
        	if (sizes[i][0] < sizes[i][1]) {
        		int temp = sizes[i][0];
        		 sizes[i][0] = sizes[i][1];
                 sizes[i][1] = temp;
         	}
        	width = Math.max(width, sizes[i][0]);
        	height = Math.max(height, sizes[i][1]);
        }
        return width * height;
    }
}

public class P6 {
	public static void main(String []args) {
		
		int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int [][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		
		System.out.println(Solution6.solution(sizes2));
	}
}
