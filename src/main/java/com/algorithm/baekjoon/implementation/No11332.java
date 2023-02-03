package com.algorithm.baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        String[] testCases = new String[c];
        for (int i = 0; i < c; i++) {
            testCases[i] = br.readLine();
        }
        String[] answer = solution(c, testCases);
        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String[] solution(int c, String[] testCases) {
        String[] answer = new String[c];
        for (int i = 0; i < c; i++) {
            String testCase = testCases[i];
            String result = "";
            StringTokenizer st = new StringTokenizer(testCase);
            String timeComplex = st.nextToken();
            long range = Long.parseLong(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            switch (timeComplex) {
                case "O(N)":
                    result = timeComplexN(c, range, t, l);
                    break;
                case "O(N^2)":
                    result = timeComplexN2(c, range, t, l);
                    break;
                case "O(N^3)":
                    result = timeComplexN3(c, range, t, l);
                    break;
                case "O(2^N)":
                    result = timeComplex2N(c, range, t, l);
                    break;
                case "O(N!)":
                    result = timeComplexNF(c, range, t, l);
                    break;
            }
            answer[i] = result;
        }
        return answer;
    }

    private static String timeComplexNF(int c, long range, int t, int l) {
        long limit = (long) (10e7 * l) / t;
        for (int i = 1; i < range + 1; i++) {
            limit = limit / i;
        }
        if (limit >= 1) {
            return "May Pass.";
        } else {
            return "TLE!";
        }
    }

    private static String timeComplex2N(int c, long range, int t, int l) {
        long limit = (long) (10e7 * l) / t;
        for (int i = 0; i < range; i++) {
            limit = limit / 2;
        }
        if (limit >= 1) {
            return "May Pass.";
        } else {
            return "TLE!";
        }
    }

    private static String timeComplexN3(int c, long range, int t, int l) {
        long limit = (long) (10e7 * l) / t;
        for (int i = 0; i < 3; i++) {
            limit = limit / range;
        }
        if (limit >= 1) {
            return "May Pass.";
        } else {
            return "TLE!";
        }
    }

    private static String timeComplexN2(int c, long range, int t, int l) {
        long limit = (long) (10e7 * l) / t;
        for (int i = 0; i < 2; i++) {
            limit = limit / range;
        }
        if (limit >= 1) {
            return "May Pass.";
        } else {
            return "TLE!";
        }
    }

    private static String timeComplexN(int c, long range, int t, int l) {
        long limit = (long) (10e7 * l) / t;
        for (int i = 0; i < 1; i++) {
            limit = limit / range;
        }
        if (limit >= 1) {
            return "May Pass.";
        } else {
            return "TLE!";
        }
    }
}
