package ru.merkurev.leetcode.problems.p0125;

/**
 * 125. Valid Palindrome.
 * <p>
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads
 * the same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Constraints:
 * <p>
 * • 1 <= s.length <= 2 * 105<br>
 * • s consists only of printable ASCII characters.
 */
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char first = Character.toLowerCase(s.charAt(start));
            if (!Character.isLetterOrDigit(first)) {
                start++;
                continue;
            }

            char second = Character.toLowerCase(s.charAt(end));
            if (!Character.isLetterOrDigit(second)) {
                end--;
                continue;
            }

            if (second != first) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}