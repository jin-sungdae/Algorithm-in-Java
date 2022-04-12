package step.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2581 {
    public static boolean isPrime(int number){
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = M ; i <= N; i++){
            if (isPrime(i))
                list.add(i);
        }
        int result = list.stream().mapToInt(Integer::intValue).sum();
        if (list.isEmpty())
            System.out.println(-1);
        else {
            System.out.println(result);
            System.out.println(list.get(0));
        }
    }
}
