package com.algorithm.baekjoon.greedy;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
class No1715Test {
    @Test
    void 리스트_테케1() throws Exception {
        // given
        int n = 3;
        List<Integer> testList = new ArrayList<>();
        testList.add(40);
        testList.add(20);
        testList.add(10);
        int expected = 100;
        // when
        int result = No1715.methodUsingList(testList);
        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void 우선순위큐_테케1() throws Exception {
        // given
        int n = 3;
        Queue<Integer> testQueue = new PriorityQueue<>();
        testQueue.add(40);
        testQueue.add(20);
        testQueue.add(10);
        int expected = 100;
        // when
        int result = No1715.methodUsingPq(testQueue);
        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void 리스트_테케2() throws Exception {
        // given
        int n = 5;
        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(11);
        testList.add(12);
        testList.add(13);
        testList.add(14);
        int expected = 141;
        // when
        int result = No1715.methodUsingList(testList);
        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void 우선순위큐_테케2() throws Exception {
        // given
        int n = 5;
        Queue<Integer> testQueue = new PriorityQueue<>();
        testQueue.add(10);
        testQueue.add(11);
        testQueue.add(12);
        testQueue.add(13);
        testQueue.add(14);
        int expected = 141;
        // when
        int result = No1715.methodUsingPq(testQueue);
        // then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void 속도실험() throws Exception {
        // given
        int n = 100000;
        int[] testArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            testArray[i] = random.nextInt(999) + 1;
        }

        Queue<Integer> testQueue = new PriorityQueue<>();
        for (int i : testArray) {
            testQueue.add(i);
        }

        List<Integer> testList = new ArrayList<>();
        for (int i : testArray) {
            testList.add(i);
        }
        // when
        long startQueue = System.currentTimeMillis();
        No1715.methodUsingPq(testQueue);
        long endQueue = System.currentTimeMillis();

        long startList = System.currentTimeMillis();
        No1715.methodUsingList(testList);
        long endList = System.currentTimeMillis();
        // then
        log.info("Queue: {}ms", endQueue - startQueue);
        log.info("List: {}ms", endList - startList);
    }
}