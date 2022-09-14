import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] sNum = new long[N];
        long[] Remain = new long[M];
        long Cnt = 0;

        st = new StringTokenizer(br.readLine());
        sNum[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            sNum[i] = sNum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int Remainder = (int) (sNum[i] % M);
            if (Remainder == 0) {
                Cnt++;
            }
            Remain[Remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if (Remain[i] > 1) {
                Cnt += (Remain[i] * (Remain[i] - 1) / 2);
            }
        }

        System.out.println(Cnt);
    }
}
