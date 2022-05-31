package grepcodingtest;
import java.util.*;

class Solution2 {
    public static int solution(int[] bricks, int n, int k) {
        int answer = 0;
        boolean []visited = new boolean[bricks.length];
        int [] kList = new int[bricks.length];
        Integer []newBricks = new Integer[bricks.length];
        for (int i = 0; i < bricks.length; i++) {
        	newBricks[i] = bricks[i];
        }
        kList[0] = Integer.MAX_VALUE;
        kList[bricks.length - 1] = Integer.MAX_VALUE;
        for (int i = 1; i < bricks.length - 1; i++)
        	kList[i] = 1;

  

        	for (int i = 1; i < bricks.length - 1; i++) {
        		for (int j = 1; j < bricks.length - 1; j++) {
        			if (bricks[i] < bricks[j])kList[i] = kList[i] + 1;
        			
        		}
        	}
        	for (int i = 0; i <bricks.length; i++)
        		System.out.print(kList[i] + " ");
        
        for (int i = 0; i < k - 1; i++) {
        	for (int j = 1; j < bricks.length - 1; j++) {
        		
        	}
        }
      
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		int [] bricks = {1, 2, 5, 3, 1, 0, 2, 3};
		System.out.println(Solution2.solution(bricks, 6, 3));
	}
}
