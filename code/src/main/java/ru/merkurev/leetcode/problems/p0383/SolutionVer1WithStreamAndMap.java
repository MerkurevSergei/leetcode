package ru.merkurev.leetcode.problems.p0383;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

/**
 * 383. Ransom Note
 * <p>
 * Given two strings ransomNote and magazine, return true if ransomNote can be
 * constructed by using the letters from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 * <p>
 * Constraints:
 * <p>
 * • 1 <= ransomNote.length, magazine.length <= 105<br>
 * • ransomNote and magazine consist of lowercase English letters.
 */
class SolutionVer1WithStreamAndMap {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Long> charWithCount = magazine.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), counting()));

        for (Character c : ransomNote.toCharArray()) {
            if (charWithCount.get(c) == null || charWithCount.get(c) == 0) {
                return false;
            }
            charWithCount.put(c, charWithCount.get(c) - 1);
        }
        return true;
    }
}