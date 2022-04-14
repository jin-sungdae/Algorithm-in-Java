package study.greedy;

import java.util.*;

class Time implements Comparable<Time>{
	public int s, e;
	Time(int s, int e){
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if (this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

public class P1931 {
	public static int solution(ArrayList<Time> arr, int n) {
		int cnt = 0, endTime = 0;
		Collections.sort(arr);
		for (Time ob : arr) {
			if (ob.s >= endTime) {
				cnt++;
				endTime = ob.e;
			}
		}
		return cnt;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for (int i = 0; i < N; i++) 
			arr.add(new Time(sc.nextInt(), sc.nextInt()));
		System.out.println(solution(arr, N));
	}
}
