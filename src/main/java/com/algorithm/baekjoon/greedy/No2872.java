package com.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No2872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> bookOrder = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bookOrder.add(Integer.parseInt(br.readLine()));
        }
        int answer = solution(n, bookOrder);
        System.out.println(answer);

    }

    public static int solution(int n, List<Integer> bookOrder) {
        List<Integer> already = new ArrayList<>();
        int startingPoint = bookOrder.indexOf(n);
        already.add(bookOrder.get(startingPoint));
        for (int i = startingPoint - 1; i >= 0; i--) {
            if (already.get(already.size() - 1) - bookOrder.get(i) == 1) {
                already.add(bookOrder.get(i));
            }
        }
        return n - already.size();
    }
}
