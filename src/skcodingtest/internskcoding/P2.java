package skcodingtest.internskcoding;

class Solution2 {
    public static int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = new int [2];


        for (int i = 0; i < periods.length; i++){
            int sum = 0;
            int first = 0;
            boolean isVip = false;
            boolean willVip = false;
                first = payments[i][0];
                for (int j = 0; j < payments[0].length; j++) {
                    sum += payments[i][j];

                }


                if (periods[i] >= 24 && periods[i] < 60 && sum >= 900000){
                    isVip = true;
                } else if (periods[i] >= 60 && sum >= 600000){
                    isVip = true;
                }
                sum = sum - first + estimates[i];

                if (periods[i] >= 23 && periods[i] < 59 && sum >= 900000){
                    willVip = true;
                } else if (periods[i] >= 59 && sum >= 600000){
                    willVip = true;
                }
                if (isVip == false && willVip == true){
                    answer[0]++;
                } else if (isVip == true && willVip == false){
                    answer[1]++;
                }
            }
        return answer;
    }
}

public class P2 {
    public static void main(String[] args) {


        int[] periods = {20, 23, 24};
        int[][] payments = {{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000},
                {100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000},
                {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
        };
        int[] estimates = {100000, 100000, 1000000};

        for (int x : Solution2.solution(periods, payments, estimates)){
            System.out.println(x);
        }
    }

}
