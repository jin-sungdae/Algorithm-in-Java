package programmers1L;

import java.util.*;

class Point{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Solution {
	static Queue<Point> p;
	
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        Point left = new Point(3, 0);
        Point right = new Point(3, 2);

        p = new LinkedList<>();
        for (int x : numbers) {
        	if (x == 0) x = 11;
        	p.add(new Point((x - 1) / 3, (x - 1) % 3));
        }
        
        while (!p.isEmpty()) {
        	Point tmp = p.poll();
        	if (tmp.y == 0) {
        		left = tmp;
        		answer += "L";
        	} else if (tmp.y == 2) {
        		right = tmp;
        		answer += "R";
        	} else {
        		int diff = (Math.abs(tmp.x - left.x) + Math.abs(tmp.y - left.y)) - (Math.abs(tmp.x - right.x) + Math.abs(tmp.y - right.y));
        		if (diff > 0) {
        			right = tmp;
        			answer += "R";
        		} else if (diff == 0) {
        			if (hand.equals("right")) {
        				right = tmp;
            			answer += "R";
        			} else {
        				left = tmp;
            			answer += "L";
        			}
        		
        		}else {
        			left = tmp;
        			answer += "L";
        		}

        	}
        }
       
        return answer;
    }

}

public class P1 {
	public static void main(String []args) {
		int []num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(Solution.solution(num, "right"));
	}
}
