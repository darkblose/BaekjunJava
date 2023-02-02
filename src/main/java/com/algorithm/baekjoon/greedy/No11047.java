package com.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int answer = solution(n, k, coins);
        System.out.println(answer);
    }

    public static int solution(int n, int k, int[] coins) {
        int answer = 0;
        int current = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (coins[i] <= k - current) {
                current = current + coins[i];
                answer++;
            }
            if (current == k) {
                break;
            }
        }
        return answer;
    }
}
