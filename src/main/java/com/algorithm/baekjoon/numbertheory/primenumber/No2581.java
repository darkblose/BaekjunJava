package com.algorithm.baekjoon.numbertheory.primenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class No2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> answer = solution(m, n);
        while (!answer.isEmpty()) {
            System.out.println(answer.remove());
        }
    }

    public static Queue<Integer> solution(int m, int n) {
        Queue<Integer> answer = new PriorityQueue<>(Collections.reverseOrder());
        int[] array = calculatingPrime(m, n);
        int min = 0;
        int sum = 0;
        for (int i = m; i < n + 1; i++) {
            if (min == 0 && array[i] != 0) {
                min = array[i];
            }
            sum = sum + array[i];
        }
        if (sum == 0) {
            answer.add(-1);
        } else {
            answer.add(sum);
            answer.add(min);
        }
        return answer;
    }

    private static int[] calculatingPrime(int m, int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            array[i] = i;
        }
        array[1] = 0;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            for (int j = 2 * i; j < n + 1; j++) {
                if (array[i] == 0) {
                    continue;
                }
                if (array[j] % i == 0) {
                    array[j] = 0;
                }
            }
        }
        return array;
    }
}
