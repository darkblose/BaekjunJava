package average;

import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aScore = new int[n];
        long m = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            aScore[i] = sc.nextInt();
        }

        for (int i = 0; i < aScore.length; i++) {
            m = Math.max(m, aScore[i]);
            sum += aScore[i];
        }

        System.out.println(sum * 100 / m / n);

    }
}
