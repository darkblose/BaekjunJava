package com.algorithm.baekjoon.divideandconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class No17829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] squares = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                squares[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] answer = solution(squares);
        System.out.println(answer[0][0]);
    }

    public static int[][] solution(int[][] originalMatrix) {

        int n = originalMatrix.length;

        if (n == 1) {
            return originalMatrix;
        }
        int[][] poolingMatrix = new int[n / 2][n / 2];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
                int no1 = originalMatrix[2 * i][2 * j];
                int no2 = originalMatrix[2 * i][2 * j + 1];
                int no3 = originalMatrix[2 * i + 1][2 * j];
                int no4 = originalMatrix[2 * i + 1][2 * j + 1];

                pq.add(no1);
                pq.add(no2);
                pq.add(no3);
                pq.add(no4);

                pq.remove();
                Integer secondNum = pq.remove();

                poolingMatrix[i][j] = secondNum;
            }
        }

        return solution(poolingMatrix);
    }
}

