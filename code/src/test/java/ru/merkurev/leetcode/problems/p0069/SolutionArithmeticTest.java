package ru.merkurev.leetcode.problems.p0069;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sqrt(x) Arithmetic Solution")
class SolutionArithmeticTest {

    @Test
    @DisplayName("Sqrt of 4")
    void mySqrt4() {
        int i = new SolutionArithmetic().mySqrt(4);
        assertEquals(2, i);
    }

    @Test
    @DisplayName("Sqrt of 8")
    void mySqrt8() {
        int i = new SolutionArithmetic().mySqrt(8);
        assertEquals(2, i);
    }
}