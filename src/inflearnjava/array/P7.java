package inflearnjava.array;

import java.util.Scanner;

public class P7 {

    public static int solution(int [] list){
        int result = 0;
        int sum = 0;

        for (int i = 0; i < list.length; i++){
            if (list[i] == 0){
                sum = 0;
            } else if (list[i] == 1){
                sum++;
            }
            result += sum;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []list = new int[N];
        for (int i = 0; i < N; i++){
            list[i] = sc.nextInt();
        }
        System.out.println(solution(list));
    }
}
