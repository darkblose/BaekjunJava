package com.algorithm.baekjoon.search.breadthfirstsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No11724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            lists.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            lists.get(s).add(e);
            lists.get(e).add(s);
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                BFS(lists, visited, i);
            }
        }
        System.out.println(count);
    }

    static void BFS(List<List<Integer>> lists, boolean[] visited, int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : lists.get(v)) {
            if (visited[i] == false) {
                BFS(lists, visited, i);
            }
        }
    }
}