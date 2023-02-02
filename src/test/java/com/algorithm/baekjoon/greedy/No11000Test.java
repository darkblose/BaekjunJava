package com.algorithm.baekjoon.greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No11000Test {
    @Test
    void 테케1() throws Exception {
        // given
        int n = 3;
        int[][] timeTable = {{1, 3}, {2, 4}, {3, 5}};
        int expected = 2;
        // when
        int result = No11000.solution(n, timeTable);
        // then
        assertThat(result).isEqualTo(expected);
    }
}