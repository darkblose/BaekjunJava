import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] aScore = new int[N];
        long M = 0;
        long Sum = 0;

        for (int i = 0; i < N; i++) {
            aScore[i] = sc.nextInt();
        }

        for (int i = 0; i < aScore.length; i++) {
            M = Math.max(M, aScore[i]);
            Sum += aScore[i];
        }

        System.out.println(Sum * 100 / M / N);

    }
}
