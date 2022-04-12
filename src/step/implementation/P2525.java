package step.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st1.nextToken());

        int resultH = 0;
        int resultM = 0;
        if (M + T >= 60){
            resultH = H + (M + T) / 60;
            resultM = (M + T) % 60;
            if (resultH >= 24){
                resultH = resultH % 24;
            }
        } else{
            resultH = H;
            resultM = M + T;
            if (resultH >= 24){
                resultH = resultH % 24;
            }
        }
        System.out.print(resultH + " " + resultM);
    }
}
