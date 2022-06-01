package study.SummerWinterCoding2019;

class Solution {
	
	public static int gcd(int w, int h) {

		if (w % h == 0)
			return h;
		return gcd(h, w % h);
	}
	
    public static long solution(int w, int h) {
    	long whole = (long)w * h;
    	long broken = w + h - (gcd(w, h));

        return whole - broken;
    }
}

public class P1 {
	public static void main(String []args) {
		System.out.println(Solution.solution(8, 12));
	}
}
