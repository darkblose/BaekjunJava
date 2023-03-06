package com.algorithm.baekjoon.datastructures.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No24453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int answer = solution(N, M, A, X, Y);
        System.out.println(answer);
    }

    public static int solution(int n, int m, int[] a, int x, int y) {
        if (m == y) {
            return 0;
        }

        if (y == 0) {
            return m;
        }

        int maxNonErrorRange = 0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int nonErrorRange = a[i + 1] - a[i] - 1;
            if (maxNonErrorRange < nonErrorRange) {
                maxNonErrorRange = nonErrorRange;
                maxStartIndex = i;
                maxEndIndex = i + 1;
            }
        }

        while (maxStartIndex < maxEndIndex) {
            if (maxNonErrorRange >= x) {
                return m - y;
            }

            if (a[maxStartIndex] == 1 && a[maxEndIndex] != n) {
                maxEndIndex += 1;
                maxNonErrorRange = a[maxEndIndex] - a[maxStartIndex] - 1;
            } else if (a[maxStartIndex] != 1 && a[maxEndIndex] == n) {
                maxStartIndex -= 1;
                maxNonErrorRange = a[maxEndIndex] - a[maxStartIndex] - 1;
            } else if (a[maxStartIndex] == 1 && a[maxEndIndex] == n) {
                if (y == 1) {
                    return m - 1;
                } else if (y == 2) {
                    return m - 2;
                }
            }

            m -= 1;
            y -= 1;
        }
        return 0;
    }
}
