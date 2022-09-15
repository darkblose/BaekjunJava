import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int Answer = 0;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] aNum = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            aNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(aNum);

        for (int k = 0; k < N; k++) {
            int i = 0;
            int j = N - 1;
            int Find = aNum[k];
            while (i < j) {
                int Sum = aNum[i] + aNum[j];
                if (Sum == Find) {
                    if (i != k && j != k) { // aNum[i]와 aNum[j]가 자기 자신을 가르키는 것이 아닌지 확인
                        Answer++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (Sum < Find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(Answer);
    }
}
