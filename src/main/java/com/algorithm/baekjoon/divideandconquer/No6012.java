package com.algorithm.baekjoon.divideandconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No6012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> init = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            init.add(i);
        }
        int sum = solution(0, init);
        System.out.println(sum);
    }

    public static int solution(int sum, List<Integer> init) {
        int n = init.size();
        if (n == 1) {
            return sum;
        } else if (n == 2 || n == 3) {
            int result = init.get(0) * init.get(1);
            return sum + result;
        }

        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();
        int half = (int) Math.ceil((double) n / 2);
        for (int i = init.get(0); i < init.get(half); i++) {
            lower.add(i);
        }

        sum = solution(sum, lower);

        for (int i = init.get(half); i <= init.get(n - 1); i++) {
            higher.add(i);
        }

        sum = solution(sum, higher);

        return sum;
    }
}
