package com.algorithm.baekjoon.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class No11332Test {
    @Test
    void 테케1() throws Exception {
        // given
        int c = 1;
        String[] tc = {"O(N^3) 1000000 10 10"};
        // when
        String[] result = No11332.solution(c, tc);
        // then
        System.out.println("result = " + Arrays.toString(result));
    }

    @Test
    void 테케2() throws Exception {
        // given
        int c = 1;
        String[] tc = {"O(N!) 10000 1 1"};
        // when
        String[] result = No11332.solution(c, tc);
        // then
        System.out.println("result = " + Arrays.toString(result));
    }

}