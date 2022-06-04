package study.summerandwintercoding2018;


import java.util.*;

class Solution {
    public static int solution(int n) {
    	int ans = 0;
    	while (n != 0) {
    		if (n % 2 == 0) {
    			n = n/2;
    		} else if (n % 2 != 0) {
    			n -= 1;
    			ans++;
    		}
    	}

        return ans;
    }
}

public class P1 {
	public static void main(String []args) {
		System.out.println(Solution.solution(5));
	}
}
