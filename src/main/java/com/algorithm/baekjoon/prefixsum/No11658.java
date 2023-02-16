package com.algorithm.baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No11658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumMatrix = getSumMatrix(n, matrix);

        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            if (Integer.parseInt(st.nextToken()) == 0) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int changeNumber = Integer.parseInt(st.nextToken());
                int originalNumber = matrix[x - 1][y - 1];
                int gap = changeNumber - originalNumber;
                sumMatrix = getSumMatrix(n, matrix);
            } else {
                int X1 = Integer.parseInt(st.nextToken());
                int Y1 = Integer.parseInt(st.nextToken());
                int X2 = Integer.parseInt(st.nextToken());
                int Y2 = Integer.parseInt(st.nextToken());

                answers.add(sumMatrix[X2][Y2] - sumMatrix[X2][Y1 - 1] - sumMatrix[X1 - 1][Y2] + sumMatrix[X1 - 1][Y1 - 1]);
            }
        }
        for (Integer answer : answers) {
            System.out.println(answer);
        }
    }

    private static int[][] getSumMatrix(int n, int[][] matrix) {
        int[][] sumMatrix = new int[n + 1][n + 1];
        sumMatrix[1][1] = matrix[0][0];
        for (int i = 1; i < n; i++) {
            sumMatrix[i + 1][1] = sumMatrix[i][1] + matrix[i][0];
            sumMatrix[1][i + 1] = sumMatrix[1][i] + matrix[0][i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                sumMatrix[i + 1][j + 1] = sumMatrix[i][j + 1] + sumMatrix[i + 1][j] - sumMatrix[i][j] + matrix[i][j];
            }
        }
        return sumMatrix;
    }
}
