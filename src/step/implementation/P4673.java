package step.implementation;


public class P4673 {
    static int calc(int num){
        int sum = num;
        while (num != 0){
            sum += (num % 10);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args){
        boolean []check = new boolean[10001];
        int num = 1;
        for (int i = 1; i < 10001; i++){
            int n = calc(i);
            if (n < 10001){
                check[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++){
            if (!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
