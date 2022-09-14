import java.util.Scanner;

public class No11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] aNum = new int[N];
        int[] sNum = new int[N];

        for (int i = 0; i < N; i++) {
            aNum[i] = sc.nextInt();
        }

        sNum[0] = aNum[0];
        for (int i = 1; i < N; i++) {
            sNum[i] = sNum[i - 1] + aNum[i];
        }

        for (int i = 0; i < M; i++) {
            int Start = sc.nextInt() - 1;
            int End = sc.nextInt() - 1;
            if (Start == 0) {
                System.out.println(sNum[End]);
            } else {
                System.out.println(sNum[End] - sNum[Start - 1]);
            }
        }
    }
}
