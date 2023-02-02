package com.algorithm.baekjoon.greedy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2872Test {
    @Test
    void 테케1() throws Exception {
        // given
        int n = 3;
        List<Integer> bookOrder = List.of(3, 2, 1);
        int expected = 2;
        // when
        int result = No2872.solution(n, bookOrder);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케2() throws Exception {
        // given
        int n = 4;
        List<Integer> bookOrder = List.of(1, 3, 4, 2);
        int expected = 2;
        // when
        int result = No2872.solution(n, bookOrder);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케3() throws Exception {
        // given
        int n = 5;
        List<Integer> bookOrder = List.of(3, 1, 4, 5, 2);
        int expected = 2;
        // when
        int result = No2872.solution(n, bookOrder);
        // then
        assertThat(result).isEqualTo(expected);
    }
}