package inflearnjava.greedyalgorithm;

import java.util.*;

class Time implements Comparable<Time> {
	int time;
	char state;
	Time (int time, char state){
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Time ob) {
		if (this.time == ob.time) return this.state - ob.state;
		else return this.time - ob.time;
	}
}

public class P3 {
	
	public static int solution(ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for (Time ob : arr) {
			if (ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Time> arr = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Time(a, 's'));
			arr.add(new Time(b, 'e'));
		}
		System.out.println(solution(arr));
	}
}
