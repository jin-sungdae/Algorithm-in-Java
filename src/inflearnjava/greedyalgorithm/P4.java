package inflearnjava.greedyalgorithm;

import java.util.*;

class Lecture implements Comparable<Lecture>{
	int money, time;

	Lecture(int money, int time){
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(Lecture o) {
		return o.time - this.time;
	}
}

public class P4 {
	
	static int n, max = Integer.MIN_VALUE;
	
	public static int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j = 0;
		for (int i = max; i >= 1; i--) {
			for ( ; j < n; j++) {
				if (arr.get(j).time < i) break;
				pQ.offer(arr.get(j).money);
			}
			if (!pQ.isEmpty()) answer +=pQ.poll();
		}

		
		return answer;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Lecture(a, b));
			if (b > max) max = b;
		}
		System.out.println(solution(arr));
	}
}
