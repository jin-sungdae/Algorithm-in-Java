package study.summerandwintercoding2018LV3;

import java.util.*;

class Solution {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int []apart = new int[n + 1];
        
        
        int j = 0;
 
        int cnt = 0;

//        for (int i = 1; i < n + 1; i++) {
//        	apart[i] = i;
//        	if (j < stations.length && (i >= stations[j] - w && i <= stations[j] + w)) {
//        		apart[i] = 0;
//        		if (stations[j] + w == i)
//        			j++;
//        	}
//        	if (apart[i] != 0) {
//    			cnt++;
//    		} else {
//    			answer += cnt / (1 + (w * 2));
//    			if (cnt % (1 + (w * 2)) != 0) answer++;
//    			cnt = 0;
//    		}
//        }
//        
//        for (int i = 1; i < n + 1; i++) {
//        	apart[i] = i;
//        	if (j < stations.length && i == stations[j] - w) {
//        		apart[i] = 0;
//        		if (stations[j] + w == i)
//        			j++;
//        	}
//        	if (apart[i] != 0) {
//    			cnt++;
//    		} else {
//    			answer += cnt / (1 + (w * 2));
//    			if (cnt % (1 + (w * 2)) != 0) answer++;
//    			cnt = 0;
//    			i = stations[j] + w;
//    			j++;
//    		}
//        }
//
//        if (cnt != 0) {
//        	answer += cnt / (1 + (w * 2));
//			if (cnt % (1 + (w * 2)) != 0) answer++;
//        }
        int p = 0;
        for (int i = 0; i < stations.length; i++) {
        	cnt = (stations[i] - w) - p - 1;
        	answer += cnt / (1 + (w * 2));
			if (cnt % (1 + (w * 2)) != 0) answer++;
        	p = stations[i] + w;
        }
//        if (p != stations[stations.length -1] - w) {
//        	answer += cnt / (1 + (w * 2));
//			if (cnt % (1 + (w * 2)) != 0) answer++;
//        }
        
        
        
        return answer;
    }
}

public class P1 {
	public static void main(String []args) {
		int []stations = {4, 11};
		int []stations2 = {9};
		System.out.println(Solution.solution(11, stations2, 1));
	}
}
