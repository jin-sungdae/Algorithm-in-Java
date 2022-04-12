package step.mapandset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class P2957 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        
        long count = 0;
        int depth[] = new int[n+2];
        depth[0] = -1;
        depth[n+1] = -1;
        set.add(0);
        set.add(n+1);
        
        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            depth[number] = Math.max(depth[set.lower(number)], depth[set.higher(number)]) + 1;
            set.add(number);
            count += depth[number];
            sb.append(count + "\n");
        }
        System.out.println(sb.toString());
    }
}