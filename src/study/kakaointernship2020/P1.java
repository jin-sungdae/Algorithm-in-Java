package study.kakaointernship2020;

import java.util.*;

class Solution {
	
	static Long max = Long.MIN_VALUE;
	static List<Long> numList = new ArrayList<>();
    static List<Character> opList = new ArrayList<>();
    static List<Character> opKind = new ArrayList<>();
    static Set<Character> optSet = new HashSet<>();
    static boolean [] visited;
    
    public static Long calcOpt(long a, long b, char opt) {
    	Long result = 0L;
    	if (opt == '+') {
    		result = a + b;
    	} else if (opt == '-') {
    		result = a - b;
    	} else if (opt == '*') {
    		result = a * b;
    	}
    	return result;
    }
    public static Long calc(ArrayList<Character> order) {
    	Long result = 0L;
    	List<Long> copyNumList = new ArrayList<>(numList);
    	List<Character> copyOpList = new ArrayList<>(opList);

    	for (char opt : order) {
    		for (int i = 0; i < copyOpList.size(); i++) {
    			if (opt == copyOpList.get(i)) {
    				copyNumList.set(i, calcOpt(copyNumList.get(i), copyNumList.get(i + 1), opt));
    				copyNumList.remove(i + 1);
    				copyOpList.remove(i);
    				i--;
    			}
    		}
    	}
    	return Math.abs(copyNumList.get(0));
    }
    
	public static void priorityOrder(ArrayList<Character> order) {
		if (order.size() == opKind.size()) {
			Long now = calc(order);
			if (now > max) max = now;
			return ;
		}
		for (int i = 0; i < opKind.size(); i++) {
			if (!visited[i]) {
				visited[i] = true;
				order.add(opKind.get(i));
				priorityOrder(order);
				visited[i] =false;
				order.remove(order.size() - 1);
			}
		}
	}
	
    public static long solution(String expression) {

        String [] numList2 = expression.split("[-*+]");
        expression = expression.replaceAll("[0-9]", "");

        for (String x : numList2) {
        	numList.add(Long.parseLong(x));
        }  
        for (int i = 0; i < expression.length(); i++) {
        	opList.add(expression.charAt(i));
        	optSet.add(expression.charAt(i));
        }
        opKind = new LinkedList<>(optSet);
        ArrayList<Character> order = new ArrayList<>();
        visited = new boolean[opKind.size()];
        priorityOrder(order);

        return max;
    }
}

public class P1 {
	public static void main(String []args) {
		System.out.println(Solution.solution("100-200*300-500+20"));
	}
}
