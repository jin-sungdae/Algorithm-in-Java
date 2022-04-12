package step.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class P1065 {
    static boolean calc(int number) {

        int num = number;
        int []list1 = new int[2];
        list1[0] = num % 10;
        list1[1] = (num / 10) % 10;
        Vector<Integer> list = new Vector<>();
        while (number != 0) {
            list.add(number % 10);
            number = number / 10;
        }
        if (num < 10) {
            return true;
        }
        for (int i = 2; i < list.size(); i++) {
            if (list1[0] - list1[1] != list.get(i - 1) - list.get(i)) {
                return false;
            }
        }
            return true;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i < N + 1; i++){
            if (calc(i))
                count++;
        }
        System.out.println(count);
    }
}
