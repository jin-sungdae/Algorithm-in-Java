package step.sort;

import java.io.IOException;
import java.util.*;

public class P11650 {
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [][] alist =new int[N][2];

        for (int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            alist[i][0] = a;
            alist[i][1] = b;

        }
        Arrays.sort(alist, (e1, e2)->{
            if (e1[0] == e2[0]){
                return e1[1] - e2[1];
            } else{
                return e1[0] - e2[0];
            }
        });
        for (int i = 0; i < N; i++){
            System.out.println(alist[i][0] + " " + alist[i][1]);
        }

    }
}
