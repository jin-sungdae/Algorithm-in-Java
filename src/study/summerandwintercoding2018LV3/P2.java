package study.summerandwintercoding2018LV3;

import java.util.*;

class Solution2 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        int i = 0;
        int j = 0;
        Integer[] newA = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Integer[] newB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(newA, Collections.reverseOrder());
        Arrays.sort(newB, Collections.reverseOrder());

        while(i < newA.length) {
        	if (newA[i] < newB[j]) {
    			answer++;
    			j++;
    		}
        	i++;
        }
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		int []A = {5, 1, 3, 7};
		int []B = {2, 2, 6, 8};
		System.out.println(Solution2.solution(A, B));
	}
}
