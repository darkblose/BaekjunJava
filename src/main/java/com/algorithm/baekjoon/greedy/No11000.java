package com.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class No11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] timeTable = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            timeTable[i][0] = Integer.parseInt(st.nextToken());
            timeTable[i][1] = Integer.parseInt(st.nextToken());
        }
        int answer = solution(n, timeTable);
        System.out.println(answer);
    }

    public static int solution(int n, int[][] timeTable) {
        Arrays.sort(timeTable, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        Queue<Integer> rooms = new PriorityQueue<>();
        rooms.add(timeTable[0][1]);
        for (int i = 1; i < n; i++) {
            Integer fastestEndTime = rooms.remove();
            if (fastestEndTime <= timeTable[i][0]) {
                rooms.add(timeTable[i][1]);
            } else {
                rooms.add(fastestEndTime);
                rooms.add(timeTable[i][1]);
            }
        }
        return rooms.size();
    }
}
