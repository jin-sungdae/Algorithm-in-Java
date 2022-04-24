package study.programmers2022kakaoblind;

class Solution3 {
	
	static boolean[] visited = new boolean[11];
	static int total = 0;
	static int max = 0;
	static int [] need = new int [11];
	static int [] answer = new int[11];
	
    public static int[] solution(int n, int[] info) {
        for (int i = 0; i < 11; i++) {
        	need[i] = info[i] + 1;
        	if (info[i] != 0) {
        		total += 10 -i;
        	}
        }
        need[10] = 0;
        dfs(0, 11, n);
        if (max == 0) return new int[] {-1};
        return answer;
    }
    
    public static void dfs(int a, int v, int n) {
    	if (v == 0) {
    		int sum = 0;
    		int [] arr = new int[11];
    		for (int i = 0; i < 11; i++) {
    			if (visited[i]) {
    				arr[i] = need[i];
    				if (arr[i] == 1)  sum += 10 - i;
    				else sum += (10 - i) * 2;
    			}
    		}
    		arr[10] = n;
    		if (max == sum - total) {
    			for (int i = 10; i >= 0; i--) {
    				if (answer[i] > arr[i]) break;
    				else if (answer[i] == arr[i]) continue;
    				else answer = arr;

    			}
    		} else if (max < sum - total) {
    			max = Math.max(sum - total, max);
    			answer = arr;
    		}
    		return ;
    	}
    	if (n == 0) {
    		int sum = 0;
    		int [] arr = new int [11];
    		for (int i = 0; i < 11; i++) {
    			if (visited[i]) {
    				arr[i] = need[i];
    				if (arr[i] == 1) sum += 10 - i;
    				else sum += (10 - i) * 2;
    			}
    		}
    		if (max == sum - total) {
    			for (int i = 10; i >= 0; i--) {
    				if (answer[i] > arr[i]) break;
    				else if (answer[i] == arr[i]) continue;
    				else answer = arr;
    			}
    		} else if (max < sum - total) {
    			max = Math.max(sum - total, max);
    			answer = arr;
    		}
    		return ;
    	}
    	
    	for (int i = a; i < 11; i++) {
    		if (n >= need[i]) {
    			visited[i] = true;
    			n -= need[i];
    			dfs(a + 1, v - 1, n);
    			visited[i] = false;
    			n += need[i];
    		}
    	}
    }
}

public class P3 {
	public static void main(String []args) {
		int [] info = {2,1,1,1,0,0,0,0,0,0,0};
		for (int x : Solution3.solution(5, info)) {
			System.out.print(x);
		}
	}
}
