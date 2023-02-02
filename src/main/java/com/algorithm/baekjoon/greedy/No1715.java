package com.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No1715 {
    public static void main(String[] args) throws IOException {
//        List<Integer> cardQuantityList = getList();
//        int answer = methodUsingList(cardQuantityList);
        Queue<Integer> cardQuantityPq = getPriorityQueue();
        int answer = methodUsingPq(cardQuantityPq);
        System.out.println(answer);
    }

    public static PriorityQueue<Integer> getPriorityQueue() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> cardQuantityPq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            cardQuantityPq.add(Integer.parseInt(br.readLine()));
        }
        return cardQuantityPq;
    }

    public static int methodUsingPq(Queue<Integer> cardQuantityPq) {
        int answer = 0;
        while (cardQuantityPq.size() > 1) {
            Integer firstMin = cardQuantityPq.remove();
            Integer secondMin = cardQuantityPq.remove();
            int result = firstMin + secondMin;
            answer = answer + result;
            cardQuantityPq.add(result);
        }
        return answer;
    }

    public static List<Integer> getList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> cardQuantityList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cardQuantityList.add(Integer.parseInt(br.readLine()));
        }
        return cardQuantityList;
    }

    public static int methodUsingList(List<Integer> cardQuantityList) {
        int answer = 0;
        while (cardQuantityList.size() > 1) {
            cardQuantityList.sort(Comparator.naturalOrder());
            Integer firstMin = cardQuantityList.get(0);
            Integer secondMin = cardQuantityList.get(1);
            int result = firstMin + secondMin;
            answer = answer + result;
            cardQuantityList.remove(firstMin);
            cardQuantityList.remove(secondMin);
            cardQuantityList.add(result);
        }
        return answer;
    }
}
