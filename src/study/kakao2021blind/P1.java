package study.kakao2021blind;


import java.util.*;

class Solution {
    static Map<String, ArrayList<Integer>> allInfo;
    static ArrayList<Integer> arr;

    public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        allInfo = new HashMap<>();
        for (String x : info)
            dfs("", 0, x.split(" "));

        List<String> list = new ArrayList<>(allInfo.keySet());
        for (int i = 0; i < list.size(); i++){
            List<Integer> scoreList = allInfo.get(list.get(i));
            Collections.sort(scoreList);
        }
        
        for (int i = 0; i < query.length; i++){
            query[i] = query[i].replaceAll(" and " , "");
            String[] str = query[i].split(" ");
            int score = Integer.parseInt(str[1]);
            answer[i] = search(str[0], score);
        }
        return answer;
    }

    static void dfs(String str, int depth, String [] info){
        if (depth == 4){
            if (!allInfo.containsKey(str)){
                arr = new ArrayList<>();
                arr.add(Integer.parseInt(info[4]));
                allInfo.put(str, arr);
            } else {
                allInfo.get(str).add(Integer.parseInt(info[4]));
            }
            return ;
        }

        dfs (str + "-", depth + 1, info);
        dfs (str + info[depth], depth + 1, info);
    }

    static int search(String str, int score){
        if (!allInfo.containsKey(str)) return 0;
        List<Integer> scoreList = allInfo.get(str);
        int start = 0, end = scoreList.size() - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (scoreList.get(mid) < score){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return scoreList.size()- start;
    }
}

public class P1 {

    public static void main(String[] args) {
        String [] str = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        for(int x : Solution.solution(str, query)){
            System.out.println(x);
        }
    }
}
