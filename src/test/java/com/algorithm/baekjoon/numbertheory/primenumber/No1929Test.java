package com.algorithm.baekjoon.numbertheory.primenumber;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1929Test {
    @Test
    void 테케1() throws Exception {
        // given
        int m = 1;
        int n = 1000000;
        int[] expected = {3, 5, 7, 11, 13};
        // when
        int[] result = No1929.solution(m, n);
        // then
        assertThat(result).isEqualTo(expected);
    }

}