package study.monthcodechallengeLV3;


class Solution {
    public static int solution(int[] a) {
        int answer = 2, l = a[0], r = a[a.length - 1];
        int []leftMin = new int [a.length];
        int []rightMin = new int[a.length];
        if (a.length == 1)
            return 1;
        for (int i = 1 ; i < a.length - 1; i++){
            if (l > a[i]) l = a[i];
            leftMin[i] = l;
        }
        for (int i = a.length - 2; i > 0; i--){
            if (r > a[i]) r = a[i];
            rightMin[i] = r;
        }
        for (int i = 1; i < a.length - 1; i++)
            if (!(a[i] > leftMin[i] && a[i] > rightMin[i])) answer++;
        return answer;
    }
}

public class P1 {
    public static void main(String[] args) {
        int []a = {9, -1, -5};
        System.out.println(Solution.solution(a));
    }
}
