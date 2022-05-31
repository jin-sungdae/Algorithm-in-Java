package study.codechallengeseason2;

import java.util.*;

class Solution2 {
	
	public static long chNumber(long n) {
		String tmp = Long.toBinaryString(n);
		long answer = 0;
		if (n % 2== 0) {
			answer = n + 1;
		} else {
			int lastIndex = tmp.lastIndexOf("0");
            int firstIndex = tmp.indexOf("1",lastIndex);
            if (lastIndex == -1) {
            	n += 1;
            	tmp = Long.toBinaryString(n);
            	tmp = tmp.substring(0, 2) + tmp.substring(2, tmp.length()).replace("0", "1");
            } else {
            	tmp = tmp.substring(0, lastIndex) + "1" + tmp.substring(lastIndex + 1, firstIndex) + "0" + tmp.substring(firstIndex + 1, tmp.length()); 
            }
            answer = Long.parseLong(tmp, 2);
		}
		
		return answer;
	}
	
    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
        	answer[i] = chNumber(numbers[i]);

        }
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		long [] numbers = {2, 7};
		for (long x : Solution2.solution(numbers)) {
			System.out.println(x);
		}
	}
}
