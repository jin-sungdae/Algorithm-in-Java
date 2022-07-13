package study.codechallengeseason3LV3;

class Solution {
    public static long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long max = (long)(1e9 * 2 * 1e5 * 2);
        long answer = max;
        long l = 0;
        long r = max; 
        long T = 0;
        int n = s.length;
        long gm, sm, gsm, gc, sc, wc, tc, rc, wt, ab = a + b, gsc;
        
        while (l <= r){
            T = (l + r) / 2;
            gm = sm = gsm = 0;
            for (int i = 0; i < n; i++){
                gc = g[i];
                sc = s[i];
                wc = w[i];
                tc = t[i];
                gsc = gc + sc;
                rc = (long)Math.ceil((double)(T / tc) / 2);
                wt = rc * wc;
                gm += Math.min(gc, wt);
                sm += Math.min(sc, wt);
                gsm += Math.min(gsc, wt);
            }
            if (a <= gm && b <= sm && ab <= gsm) {
                r = T - 1;
                answer = T;
            } else {
                l = T + 1;
            }
        }
        return answer;
    }
}

public class P1 {
	public static void main(String []args) {
		
	}
}
