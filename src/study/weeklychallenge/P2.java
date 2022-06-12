package study.weeklychallenge;

import java.util.*;

class Solution2 {
    public static String[] solution(int[][] line) {
        String[] answer = {};
        List<long []> list = new ArrayList<>();
        long minX = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE;
        long maxY = Long.MIN_VALUE;
        
        
        for (int i = 0; i < line.length; i++) {
        	long fA = line[i][0];
        	long fB = line[i][1];
        	long fC = line[i][2];
        	for (int j = i + 1; j < line.length; j++) {
        		long lA = line[j][0];
        		long lB = line[j][1];
        		long lC = line[j][2];
        		long xUp = fB * lC - fC * lB;
        		long xDown = fA * lB - fB * lA;
        		long yUp = fC * lA - fA * lC;
        		long yDown = fA * lB - fB * lA;
        		if (xDown != 0) {
        			double x = xUp / (double)xDown;
        			double y = yUp / (double)yDown;
        			
        			if (x == Math.ceil(x) && y == Math.ceil(y)) {
        				list.add(new long[] {(long) x, (long)y});
        				minX = Math.min(minX, (long) x);
        				maxX = Math.max(maxX, (long) x);
        				minY = Math.min(minY, (long) y);
        				maxY = Math.max(maxY, (long) y);
        			}
        		}
        	}
        }
        boolean [][] ch = new boolean[(int) (maxY - minY + 1)][(int) (maxX - minX + 1)];
        for (long [] s : list) {
        	int x = (int) (s[0] - minX);
        	int y = (int) (s[1] - maxY);
        	ch[Math.abs(y)][Math.abs(x)] = true;
        }
        answer = new String[ch.length];
        int i = 0;
        for (boolean [] bs : ch) {
        	StringBuilder sb = new StringBuilder();
        	for (boolean b : bs) {
        		if (b) sb.append("*");
        		else sb.append(".");
        	}
        	answer[i] = sb.toString();
        	i++;
        }
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		int[][]line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
		for (String x : Solution2.solution(line)) {
			System.out.println(x);
		}
	}
}
