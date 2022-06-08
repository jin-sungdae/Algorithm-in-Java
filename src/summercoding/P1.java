package summercoding;

class Solution {
    public static int solution(int[][] atmos) {
        int answer = 0;
        int dayCnt = 0;
        for (int i = 0; i < atmos.length; i++){
            int mise = atmos[i][0];
            int chomise = atmos[i][1];
            if ((mise >= 81 && mise <= 150) || (chomise >=36 && chomise <= 75)){
                dayCnt++;
            }
            else if ((mise >= 151 || chomise >= 76) ){
                dayCnt++;
            }else if (mise >= 151 && chomise >= 76) {
                answer++;
                dayCnt = 0;
            } else if ((mise <= 80 || chomise <= 35) && dayCnt != 0) dayCnt++;
            if (dayCnt == 2) {
                answer++;
                dayCnt = 0;
            }
            System.out.println(i + "answer = " + answer + "dayCnt = " + dayCnt);
        }
        if (dayCnt > 0) answer++;
        return answer;
    }
}

public class P1 {
    public static void main(String[] args) {
        int [][] atoms = {{80, 35}, {70, 38}, {100, 41}, {75,30}, {160,80}, {77, 29}, {181, 68}, {151, 76}};
        int [][] atoms2 = {{140, 90}, {177, 75}, {95, 45}, {71, 31}, {150, 30}, {80, 35}, {72, 33}, {166, 81}, {151, 75}};
        System.out.println(Solution.solution(atoms2));
    }
}
