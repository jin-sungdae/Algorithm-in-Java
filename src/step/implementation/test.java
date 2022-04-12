package step.implementation;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++){
            list.add(i);
        }
        for (int i = 0; i < 10000000; i++){
            System.out.println(list.get(i));
        }
    }
}
