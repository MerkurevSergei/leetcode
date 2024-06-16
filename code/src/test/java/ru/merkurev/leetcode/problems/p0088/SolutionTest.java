package ru.merkurev.leetcode.problems.p0088;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Merge Sorted Array")
class SolutionTest {

    @Test
    @DisplayName("Non Empty Array")
    void mergeTwoArrays() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        new Solution().merge(nums1, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    @DisplayName("Second Empty Array")
    void mergeSecondEmptyArray() {
        int[] nums1 = {1};
        new Solution().merge(nums1, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    @DisplayName("First Empty Array")
    void mergeFirstEmptyArray() {
        int[] nums1 = {0};
        new Solution().merge(nums1, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }
}