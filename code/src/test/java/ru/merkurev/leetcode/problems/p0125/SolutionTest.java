package ru.merkurev.leetcode.problems.p0125;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Valid Palindrome")
class SolutionTest {

    @Test
    @DisplayName("Palindrome with not-letter and not-digit symbols")
    void isPalindrome() {
        boolean isPalindrome = new Solution().isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(isPalindrome);
    }

    @Test
    @DisplayName("Empty palindrome")
    void isEmptyPalindrome() {
        boolean isPalindrome = new Solution().isPalindrome(" ");
        assertTrue(isPalindrome);
    }

    @Test
    @DisplayName("Not a palindrome")
    void NotAPalindrome() {
        boolean isPalindrome = new Solution().isPalindrome("race a car");
        assertFalse(isPalindrome);
    }
}