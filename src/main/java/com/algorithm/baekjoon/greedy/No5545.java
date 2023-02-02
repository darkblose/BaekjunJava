package com.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No5545 {
    public static void main(String[] args) throws IOException {
        greedy();
    }

    private static void greedy() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine()); // 토핑의 종류의 수 N
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 도우의 가격 A
        int b = Integer.parseInt(st.nextToken()); // 토핑의 가격 B
        int sum = Integer.parseInt(br.readLine());
        int ans = sum / a;

        for (int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < n; i++) {
            sum += pq.poll();
            int temp = sum / ((i + 1) * b + a);
            if (temp < ans) {
                break;
            }
            ans = temp;
        }
        System.out.println(ans);
    }
}