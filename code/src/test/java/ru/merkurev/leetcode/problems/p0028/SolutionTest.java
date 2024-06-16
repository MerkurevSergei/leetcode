package ru.merkurev.leetcode.problems.p0028;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Find the Index of the First Occurrence in a String")
class SolutionTest {

    @Test
    @DisplayName("Has occurrence")
    void strStrCase1() {
        int i = new Solution().strStr("sadbutsad", "sad");
        assertEquals(0, i);
    }

    @Test
    @DisplayName("Has not occurrence")
    void strStrCase2() {
        int i = new Solution().strStr("leetcode", "leeto");
        assertEquals(-1, i);
    }

    @Test
    @DisplayName("needle has more length then haystack")
    void strStrCase3() {
        int i = new Solution().strStr("aaa", "aaaa");
        assertEquals(-1, i);
    }
}