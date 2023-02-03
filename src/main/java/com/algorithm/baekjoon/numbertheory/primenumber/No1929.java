package com.algorithm.baekjoon.numbertheory.primenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] answer = solution(m, n);
        for (int i = m; i < n + 1; i++) {
            if (answer[i] != 0) {
                System.out.println(i);
            }
        }
    }

    public static int[] solution(int m, int n) {
        int[] answer = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            answer[i] = i;
        }
        answer[1] = 0;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            for (int j = 2 * i; j < n + 1; j++) {
                if (answer[i] == 0) {
                    continue;
                }
                if (answer[j] % i == 0) {
                    answer[j] = 0;
                }
            }
        }
        return answer;
    }
}
