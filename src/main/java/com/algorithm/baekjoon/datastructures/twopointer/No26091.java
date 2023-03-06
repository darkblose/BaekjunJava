package com.algorithm.baekjoon.datastructures.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No26091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(N, M, A);
        System.out.println(answer);
    }

    public static int solution(int n, int m, int[] a) {

        int answer = 0;
        int pointerLeft = 0;
        int pointerRight = n - 1;
        int currentStat = 0;

        Arrays.sort(a);
        while (pointerLeft <= pointerRight) {
            if (pointerLeft == pointerRight && currentStat == 0) {
                return answer;
            } else if (pointerLeft != pointerRight && currentStat == 0) {
                currentStat = a[pointerLeft] + a[pointerRight];
                pointerLeft += 1;
                pointerRight -= 1;
            } else if (pointerRight - pointerLeft >= 0) {
                int lack = m - currentStat;

                if (lack <= a[pointerLeft + 1]) {
                    pointerLeft += 1;
                    currentStat += a[pointerLeft];
                } else {
                    pointerRight -= 1;
                    currentStat += a[pointerRight];
                }
            }

            if (currentStat >= m) {
                answer += 1;
                currentStat = 0;
            }
        }
        return answer;
    }
}
