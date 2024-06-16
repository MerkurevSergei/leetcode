package ru.merkurev.leetcode.problems.p0070;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Climbing Stairs")
class SolutionTest {

    @Test
    @DisplayName("2 stars")
    void climbStairs2() {
        int i = new Solution().climbStairs(2);
        assertEquals(2, i);
    }

    @Test
    @DisplayName("3 stars")
    void climbStairs3() {
        int i = new Solution().climbStairs(3);
        assertEquals(3, i);
    }

    @Test
    @DisplayName("43 stars")
    void climbStairs43() {
        int i = new Solution().climbStairs(43);
        assertEquals(701408733, i);
    }

    @Test
    @DisplayName("44 stars")
    void climbStairs44() {
        int i = new Solution().climbStairs(44);
        assertEquals(1134903170, i);
    }
}