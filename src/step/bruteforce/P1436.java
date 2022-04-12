package step.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {

    public static void calc(int number){
        Integer n = 666;

        int count = 0;
        while (true) {
            if (String.valueOf(n).contains("666")) {
                count++;
            }
            if (count == number) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        calc(N);
    }
}
