package step.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6549 {
    public static int[] histogram;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N;
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            if(N == 0) {
                break;
            }
            histogram = new int[N];
            for(int i = 0; i < N; i++) {
                histogram[i] = Integer.parseInt(st.nextToken());
            }
            sb.append(getArea(0, N - 1)).append('\n');
            histogram = null;

        }
        System.out.println(sb);
    }

    public static long getArea(int lo, int hi) {

        if(lo == hi) {
            return histogram[lo];
        }
        int mid = (lo + hi) / 2;

        long leftArea = getArea(lo, mid);
        long rightArea = getArea(mid + 1, hi);

        long max = Math.max(leftArea, rightArea);

        max = Math.max(max, getMidArea(lo, hi, mid));

        return max;

    }

    public static long getMidArea(int lo, int hi, int mid) {
        int toLeft = mid;
        int toRight = mid;

        long height = histogram[mid];
        long maxArea = height;

        while(lo < toLeft && toRight < hi) {
            if(histogram[toLeft - 1] < histogram[toRight + 1]) {
                toRight++;
                height = Math.min(height, histogram[toRight]);
            }
            else {
                toLeft--;
                height = Math.min(height, histogram[toLeft]);
            }

            maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
        }

        while(toRight < hi) {
            toRight++;
            height = Math.min(height, histogram[toRight]);
            maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
        }

        while(lo < toLeft) {
            toLeft--;
            height = Math.min(height, histogram[toLeft]);
            maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
        }

        return maxArea;
    }
}
