package ru.merkurev.leetcode.problems.p0070;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Climbing Stairs not work after 44")
class SolutionNotWorkAfter44Test {

    @Test
    @DisplayName("2 stars")
    void climbStairs2() {
        int i = new SolutionNotWorkAfter44().climbStairs(2);
        assertEquals(2, i);
    }

    @Test
    @DisplayName("3 stars")
    void climbStairs3() {
        int i = new SolutionNotWorkAfter44().climbStairs(3);
        assertEquals(3, i);
    }

    @Test
    @DisplayName("43 stars")
    void climbStairs43() {
        int i = new SolutionNotWorkAfter44().climbStairs(43);
        assertEquals(701408733, i);
    }

    @Test
    @DisplayName("44 stars")
    @Disabled
    void climbStairs44() {
        int i = new SolutionNotWorkAfter44().climbStairs(44);
        assertEquals(1134903170, i);
    }
}