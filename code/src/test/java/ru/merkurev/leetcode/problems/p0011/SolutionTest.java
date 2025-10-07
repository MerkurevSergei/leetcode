package ru.merkurev.leetcode.problems.p0011;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    @DisplayName("Returns area=49 for heights [1,8,6,2,5,4,8,3,7]")
    void withExampleArray_expectedResult() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        assertEquals(49, result, "Maximum area should be 49 (height=7, width=7)");
    }

    @Test
    @DisplayName("Returns area=1 for heights [1,1]")
    void withTwoHeightsEqualsOne_expectedResult() {
        int[] height = {1, 1};
        int result = solution.maxArea(height);
        assertEquals(1, result, "Area with two lines of height 1 should be 1");
    }
}