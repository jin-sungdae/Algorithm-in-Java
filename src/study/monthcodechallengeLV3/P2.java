package study.monthcodechallengeLV3;

class Solution2 {
    public static int solution(int[] a) {
        int answer = 0;
        int []list = new int[a.length];

        for (int i = 0; i < a.length; i++){
            list[a[i]]++;
        }
        for (int i = 0; i < a.length; i++){
            if (list[i] == 0 || list[i] < answer) continue;
            int  temp = 0;
            for (int j = 0; j < a.length - 1; j++){
                if ((a[j] == i || a[j + 1] == i) && (a[j] != a[j + 1])) {
                    temp++;
                    j++;
                }
            }
            answer = Math.max(answer, temp);
        }
        return answer * 2;
    }
}

public class P2 {
    public static void main(String[] args) {
        int []a = {5,2,3,3,5,3};
        System.out.println(Solution2.solution(a));
    }
}
