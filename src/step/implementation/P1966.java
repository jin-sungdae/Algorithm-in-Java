package step.implementation;

import java.util.*;

public class P1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		int textNum = 0;
		int indexNum = 0;
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			textNum = sc.nextInt();
			indexNum = sc.nextInt();
			int resultCOunt = 0;
			queue = new LinkedList<>();
			for (int j = 0; j < textNum; j++) {
				int exNum = sc.nextInt();
				queue.add(exNum);
			}
			while(!queue.isEmpty()) {
				Integer mV = queue.stream().mapToInt(x->x).max()
						.orElseThrow(NoSuchElementException::new);
				Integer value = queue.poll();
				resultCOunt++;
				indexNum--;
				if (mV > value) {
					queue.add(value);
					resultCOunt--;
					if (indexNum == -1)
						indexNum = queue.size() - 1;
				} else if (indexNum == -1){
						break;
				}
			}
				result.add(resultCOunt);
		}
			for (Integer s : result){
				System.out.println(s + " ");
			}
	}
}



