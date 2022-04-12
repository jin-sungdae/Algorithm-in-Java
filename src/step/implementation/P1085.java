package step.implementation;


import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int resultX = w - x;
        int resultY = h - y;
        int resultXW = w - resultX;
        int resultYH = h - resultY;
        int min = resultX;
        int [] arr = new int[3];
        arr[0] = resultY;
        arr[1] = resultXW;
        arr[2] = resultYH;
        for (int i = 0; i < 3; i++){
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }
}
