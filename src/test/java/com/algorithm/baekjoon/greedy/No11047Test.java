package com.algorithm.baekjoon.greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No11047Test {
    @Test
    void 테케1() throws Exception {
        // given
        int n = 10;
        int k = 4200;
        int[] coins = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int expected = 6;
        // when
        int result = No11047.solution(n, k, coins);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케2() throws Exception {
        // given
        int n = 10;
        int k = 4790;
        int[] coins = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int expected = 12;
        // when
        int result = No11047.solution(n, k, coins);
        // then
        assertThat(result).isEqualTo(expected);
    }
}