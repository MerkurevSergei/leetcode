package ru.merkurev.leetcode.problems.p0383;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Ransom Note based on stream and map")
class SolutionVer1WithStreamAndMapTest {

    @Test
    @DisplayName("Can not construct from one symbols")
    void canConstructFalseCase1() {
        boolean canConstruct = new SolutionVer1WithStreamAndMap().canConstruct("a", "b");
        assertFalse(canConstruct);
    }

    @Test
    @DisplayName("Can not construct from two symbols")
    void canConstructFalseCase2() {
        boolean canConstruct = new SolutionVer1WithStreamAndMap().canConstruct("aa", "ab");
        assertFalse(canConstruct);
    }

    @Test
    @DisplayName("Can construct")
    void canConstruct() {
        boolean canConstruct = new SolutionVer1WithStreamAndMap().canConstruct("aa", "aab");
        assertTrue(canConstruct);
    }
}