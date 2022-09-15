import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int Answer = 0;

        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] aNum = new int[N];
        for (int i = 0; i < N; i++) {
            aNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(aNum);

        int i = 0;
        int j = N - 1;
        while (i < j) {
            int Sum = aNum[i] + aNum[j];
            if (Sum < M) {
                i++;
            } else if (Sum > M) {
                j--;
            } else {
                i++;
                j--;
                Answer++;
            }
        }
        System.out.println(Answer);
    }
}