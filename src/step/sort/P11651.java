package step.sort;

import java.util.Arrays;
import java.util.Scanner;

public class P11651 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] list = new int[N][2];
        for (int i = 0; i < N; i++){
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }
        Arrays.sort(list, (e1, e2)->{
            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            }else{
                return e1[1] - e2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            sb.append(list[i][0] + " " + list[i][1] + "\n");
        }
        System.out.println(sb);
    }
}

