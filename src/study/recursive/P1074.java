package study.recursive;

import java.util.*;

public class P1074 {
	
	static int N, r, c;
	static int ch;
	
	public static void solution(int n, int chr, int chc) {
		if (n == 1 ) {
			return ;
		}
		else {
			int l = n / 2;
			if (chr < l  && chc < l ) {
				ch += l * l * 0;
				solution(l, chr, chc);
			} else if (chr < l  && chc >= l) {
				ch += l * l * 1;
				solution(l, chr, chc - l);
			} else if (chr >= l  && chc < l ) {
				ch += l * l * 2;
				solution(l, chr - l, chc);
			} else{
				ch += l * l * 3;
				solution(l, chr- l , chc - l);
			}
		}
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		int n = (int)Math.pow(2, N);
		solution(n, r, c);
		System.out.println(ch);
	}
}
