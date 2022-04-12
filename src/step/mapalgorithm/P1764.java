package step.mapalgorithm;

import java.util.*;

public class P1764 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Numb = N + M;
        ArrayList<String> list = new ArrayList<>(Numb);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0 ; i < N + M; i++){
            list.add(sc.next());
        }

        for (String str : list){
            Integer count = map.get(str);
            if (count == null){
                map.put(str, 1);
            } else {
                map.put(str, count + 1);
            }
        }

        int count = 0;
        String []result;
        result = new String[Numb];
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            if ((Integer)entry.getValue() > 1) {
                result[count] = (String)entry.getKey();
                count++;
            }
        }
        System.out.println(count);
        String []result1;
        result1 = Arrays.copyOf(result, count);
        Arrays.sort(result1);
        for (int t = 0; t < count; t++){
            System.out.println(result1[t]);
        }
    }
}