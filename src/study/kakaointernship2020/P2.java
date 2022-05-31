package study.kakaointernship2020;

import java.util.*;

class Solution2 {
    public static int[] solution(String s) {
        int[] answer = {};
        s = s.replaceAll("[\\{,\\}]", " ");
        String[] str = s.split("[ ]+");
        Map<String, Integer> hashMap = new HashMap<>();

        
        for(int j = 0; j < str.length; j++){
            if (!str[j].equals("")){
                if (hashMap.containsKey(str[j])){
                    hashMap.replace(str[j], hashMap.get(str[j]) + 1);
                }else{
                    hashMap.put(str[j], 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (o1, o2) -> {return o2.getValue().compareTo(o1.getValue());});

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(list.get(i).getKey());
        }


        return answer;
    }
}
public class P2 {
	public static void main(String []args) {
		for (int x : Solution2.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")) {
			System.out.println(x);
		}
	}
}
