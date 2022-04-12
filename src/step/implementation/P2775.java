package step.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2775 {
    static int [][]list = new int[16][16];
    static void calc(){
        for (int i = 0; i < 16; i++){
            list[0][i] = 1;
        }

        int result = 0;
        for (int i = 1; i < 16; i++){

            for (int j = 1; j < 16; j++){
                result = result +  list[i - 1][j];
                list[i][j] = result;
            }
            result = 0;


        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [] nList = new int[T];
        int [] kList = new int[T];
        calc();
        for (int i = 0; i < T; i++){
            kList[i] = Integer.parseInt(br.readLine());
            nList[i] = Integer.parseInt(br.readLine());
            System.out.println(list[kList[i] + 1][nList[i]]);
        }


    }
}
