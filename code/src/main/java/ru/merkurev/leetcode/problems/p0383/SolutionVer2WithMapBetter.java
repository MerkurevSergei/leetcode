package ru.merkurev.leetcode.problems.p0383;

import java.util.HashMap;
import java.util.Map;

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
class SolutionVer2WithMapBetter {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Long> characterMap = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            characterMap.computeIfPresent(c, (k, v) -> v + 1);
            characterMap.putIfAbsent(c, 1L);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (characterMap.get(c) == null || characterMap.get(c) == 0) {
                return false;
            }
            characterMap.put(c, characterMap.get(c) - 1);
        }
        return true;
    }
}