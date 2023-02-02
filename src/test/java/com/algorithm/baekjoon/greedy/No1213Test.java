package com.algorithm.baekjoon.greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1213Test {

    @Test
    void 테케1() throws Exception {
        // given
        String name = "AABB";
        String expected = "ABBA";
        // when
        String result = No1213.solution(name);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케2() throws Exception {
        // given
        String name = "AAABB";
        String expected = "ABABA";
        // when
        String result = No1213.solution(name);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케3() throws Exception {
        // given
        String name = "ABACABA";
        String expected = "AABCBAA";
        // when
        String result = No1213.solution(name);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케4() throws Exception {
        // given
        String name = "ABCD";
        String expected = "I'm Sorry Hansoo";
        // when
        String result = No1213.solution(name);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케5() throws Exception {
        // given
        String name = "AABBNNBB";
        String expected = "ABBNNBBA";
        // when
        String result = No1213.solution(name);
        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케6() throws Exception {
        // given
        String name = "AABBCV";
        String expected = "I'm Sorry Hansoo";
        // when
        String result = No1213.solution(name);
        // then
        assertThat(result).isEqualTo(expected);
    }
}