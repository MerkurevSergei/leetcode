package ru.merkurev.leetcode.problems.p0080;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Remove Duplicates from Sorted Array II")
class SolutionTest {

    @Test
    @DisplayName("One removed element")
    void removeDuplicatesCase1() {
        int[] input = new int[]{1, 1, 1, 2, 2, 3};

        int k = new Solution().removeDuplicates(input);

        int[] actual = new int[k];
        System.arraycopy(input, 0, actual, 0, k);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, actual);
    }

    @Test
    @DisplayName("Two removed element")
    void removeDuplicatesCase2() {
        int[] input = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};

        int k = new Solution().removeDuplicates(input);

        int[] actual = new int[k];
        System.arraycopy(input, 0, actual, 0, k);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3}, actual);
    }
}