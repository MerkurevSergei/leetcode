package ru.merkurev.leetcode.problems.p0169;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Majority Element")
class SolutionTest {

    @Test
    @DisplayName("Majority Element is 3")
    void majorityElementIs3() {
        int i = new Solution().majorityElement(new int[]{3, 2, 3});
        assertEquals(3, i);
    }

    @Test
    @DisplayName("Majority Element is 2")
    void majorityElementIs2() {
        int i = new Solution().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        assertEquals(2, i);
    }
}