package inflearnjava.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P6 {

    public static boolean isPrime(int N){
        if (N == 1) return false;
        for (int i = 2; i < N; i++){
            if (N % i == 0)
                return false;
        }
        return true;
    }

    public static void solution(String [] list){
        int []result = new int[list.length];
        for (int i = 0; i < list.length; i++){
            list[i] = new StringBuilder(list[i]).reverse().toString();
            result[i] = Integer.parseInt(list[i]);
            if (isPrime(result[i]))
                System.out.print(result[i] + " ");
        }
    }

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String [] list = new String[N];
        for (int i = 0; i < N; i++){
            list[i] = st.nextToken();
        }
        solution(list);
    }
}
