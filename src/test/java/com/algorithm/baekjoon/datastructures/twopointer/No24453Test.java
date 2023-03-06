package com.algorithm.baekjoon.datastructures.twopointer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No24453Test {
    @Test
    public void 테케1() throws Exception {
        // given
        int N = 5;
        int M = 4;
        int[] A = {1, 3, 4, 5};
        int X = 2;
        int Y = 2;
        int expected = 2;
        // when
        int result = No24453.solution(N, M, A, X, Y);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void 테케2() throws Exception {
        // given
        int N = 10;
        int M = 4;
        int[] A = {1, 4, 7, 10};
        int X = 1;
        int Y = 3;
        int expected = 1;
        // when
        int result = No24453.solution(N, M, A, X, Y);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void 테케3() throws Exception {
        // given
        int N = 9;
        int M = 2;
        int[] A = {1, 9};
        int X = 8;
        int Y = 1;
        int expected = 1;
        // when
        int result = No24453.solution(N, M, A, X, Y);
        // then
        assertThat(result).isEqualTo(expected);
    }
}