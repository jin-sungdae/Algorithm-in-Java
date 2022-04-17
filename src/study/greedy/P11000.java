package study.greedy;

import java.util.*;

class Lecture implements Comparable<Lecture> {
	int time;
	char state;
	Lecture (int time, char state){
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Lecture ob) {
		if (this.time == ob.time) return this.state - ob.state;
		else return this.time - ob.time;
	}
}

public class P11000 {
	
	public static int solution(ArrayList<Lecture> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for (Lecture ob : arr) {
			if (ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Lecture> arr = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Lecture(a, 's'));
			arr.add(new Lecture(b, 'e'));
		}
		System.out.println(solution(arr));
	}
}
