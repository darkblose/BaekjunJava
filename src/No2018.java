import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] sNum = new int[N];
        int Cnt = 1;

        sNum[0] = 1;
        for (int i = 1; i < N; i++) {
            sNum[i] = sNum[i - 1] + i;
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (sNum[j] - sNum[i] > N) {
                    break;
                } else {
                    if (sNum[j] - sNum[i] == N) {
                        Cnt++;
                    }
                }
            }
        }
        System.out.println(Cnt);

    }

}
