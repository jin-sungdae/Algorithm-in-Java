package skcodingtest.internskcoding;

class Solution {
    public static int[] solution(int[] p) {
        int[] answer = new int[p.length];
        int temp = 0;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < p.length; i++){
            for (int j = i; j < p.length; j++){
                if (p[j] < min) {
                    min = p[j];
                    index = j;
                }
            }
            if (p[i] > min){
                temp = p[i];
                p[i] = min;
                min = temp;
                p[index] = min;
                min = Integer.MAX_VALUE;
                answer[index]++;
                answer[i]++;
                index = 0;

            } else if (p[i] == min){
                min = Integer.MAX_VALUE;
                index = 0;
            }

        }
        return answer;
    }
}

public class P1 {
    public static void main(String []args){
        int [] p = {2, 5, 3, 1, 4};
        for (int x : Solution.solution(p)){
            System.out.print(x + " ");
        }
    }
}
