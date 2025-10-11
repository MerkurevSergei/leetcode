package ru.merkurev.leetcode.problems.p0079;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    @DisplayName("Word 'ABCCED' exists in grid")
    void word_ABCCED_ExistsInGrid() {
        Solution solution = new Solution();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        assertTrue(solution.exist(board, word));
    }

    @Test
    @DisplayName("Word 'SEE' exists in grid")
    void word_SEE_ExistsInGrid() {
        Solution solution = new Solution();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        assertTrue(solution.exist(board, word));
    }

    @Test
    @DisplayName("Word 'ABCB' does not exist in grid")
    void wordDoesNotExistInGrid() {
        Solution solution = new Solution();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCB";
        assertFalse(solution.exist(board, word));
    }
}