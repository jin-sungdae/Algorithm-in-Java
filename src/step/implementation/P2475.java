package step.implementation;

import java.util.Scanner;

public class P2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int result = 0;
        for (int i = 0; i < 5; i++){
            num = sc.nextInt();
            result += num * num;
        }
        System.out.println(result % 10);
    }
}
