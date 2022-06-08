package study.findprogrammingmeister;
class Solution3
{
    public static int solution(int n, int a, int b)
    {
        int answer = 1;
        int left = 0;
        int right = 0;

        if(a > b){
            left = b;
            right = a;
        } else {
            left = a;
            right = b;
        }

        while(true){
            if(left % 2 != 0 && right - left == 1){
                break;
            }

            left = (left + 1) / 2;
            right = (right + 1) / 2;
            answer++;
        }

        return answer;
    }

}

public class P3 {
    public static void main(String []args){
        System.out.println(Solution3.solution(8, 4, 7));
    }
}
