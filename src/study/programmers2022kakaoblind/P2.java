package study.programmers2022kakaoblind;

import java.util.*;

class Solution2 {
	
	public static boolean isPrime(int n) {
		boolean check = true;
		
		if (n < 2)
			check = false;
		if (n == 2)
			check = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)	return false;
		}
		return check;
	}
	
    public static int solution(int n, int k) {
        int answer = 0;
        
        String str = Integer.toString(n, k);
        for (int i = 0; i < str.length(); i++)
        	str = str.replace("00", "0");
        System.out.println(str);
        String [] list = str.split("0");
        for (int i = 0; i < list.length; i++) {
        	if (isPrime(Integer.parseInt(list[i])))
        		answer++;
        }
        return answer;
    }
}

public class P2 {
	public static void main(String []args) {
		
		System.out.println(Solution2.solution(1000001, 2));
	}
}
