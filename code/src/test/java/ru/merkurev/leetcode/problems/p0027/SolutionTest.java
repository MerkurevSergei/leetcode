package ru.merkurev.leetcode.problems.p0027;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Remove Element")
class SolutionTest {

    @Test
    @DisplayName("Remove from empty array")
    void removeElementFromEmptyArray() {
        int i = new Solution().removeElement(new int[]{}, 1);
        assertEquals(0, i);
    }

    @Test
    @DisplayName("Remove single element")
    void removeSingleElementFromArray() {
        int i = new Solution().removeElement(new int[]{1}, 1);
        assertEquals(0, i);
    }
    @Test
    @DisplayName("Not remove single element")
    void notRemoveSingleElementFromArray() {
        int[] source = {1};
        new Solution().removeElement(source, 2);
        assertArrayEquals(new int[]{1}, source);
    }

    @Test
    @DisplayName("four elements")
    void RemoveElementFromFourArray() {
        int[] source = {3,2,2,3};

        int k = new Solution().removeElement(source, 3);

        int[] actual = new int[k];
        System.arraycopy(source, 0, actual, 0, k);
        assertArrayEquals(new int[]{2, 2}, actual);
    }

    @Test
    @DisplayName("eight elements")
    void RemoveElementFromEightArray() {
        int[] source = {0,1,2,2,3,0,4,2};

        int k = new Solution().removeElement(source, 2);

        int[] actual = new int[k];
        System.arraycopy(source, 0, actual, 0, k);
        assertArrayEquals(new int[]{0,1,4,0,3}, actual);
    }

}