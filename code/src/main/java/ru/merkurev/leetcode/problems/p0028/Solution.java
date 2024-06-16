package ru.merkurev.leetcode.problems.p0028;

/**
 * 28. Find the Index of the First Occurrence in a String
 * <p>
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Constraints:
 * <p>
 * • 1 <= haystack.length, needle.length <= 104<br>
 * • haystack and needle consist of only lowercase English characters.<br>
 */
class Solution {
    public int strStr(String haystack, String needle) {
        char first = needle.charAt(0);
        inner:
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != first) {
                continue;
            }
            for (int j = 1; j < needle.length(); j++) {
                if (i + j > haystack.length() - 1) {
                    break inner;
                }
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    continue inner;
                }
            }
            return i;
        }
        return -1;
    }
}