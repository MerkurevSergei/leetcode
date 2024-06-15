package ru.merkurev.leetcode.problems.p0026;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Remove Duplicates from Sorted Array")
class SolutionTest {

    @Test
    @DisplayName("Remove Duplicates from Sorted Array")
    void removeDuplicates() {
        int[] sourceArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = new Solution().removeDuplicates(sourceArray);

        int[] actual = new int[k];
        System.arraycopy(sourceArray, 0, actual, 0, k);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, actual);
    }
}