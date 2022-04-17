package study.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class classTime implements Comparable<classTime>{
    int s, e;

    classTime(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(classTime c){
        if (this.e == c.e) return this.s - c.s;
        else return this.s - c.s;
    }
}

public class P11000 {
    static ArrayList<classTime> arrayList;
    public static int solution(){
        int cnt = 0, endTime = 0;
        Collections.sort(arrayList);
        for (classTime c : arrayList){
            if (c.s < endTime) {
                cnt++;
                endTime = c.e;
            }
            System.out.println(c.s + " " + c.e);
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arrayList = new ArrayList<>();
        for (int i = 0; i< N; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            arrayList.add(new classTime(s, e));
        }
        System.out.println(solution());
    }
}
