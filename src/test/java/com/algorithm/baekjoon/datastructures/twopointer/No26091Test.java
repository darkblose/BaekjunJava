package com.algorithm.baekjoon.datastructures.twopointer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No26091Test {
    @Test
    public void 테케1() throws Exception {
        // given
        int N = 6;
        int M = 10;
        int[] A = {3, 5, 7, 3, 5, 6};
        int expected = 2;
        // when
        int result = No26091.solution(N, M, A);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void 테케2() throws Exception {
        // given
        int N = 1;
        int M = 10;
        int[] A = {100};
        int expected = 0;
        // when
        int result = No26091.solution(N, M, A);
        // then
        assertThat(result).isEqualTo(expected);
    }

}