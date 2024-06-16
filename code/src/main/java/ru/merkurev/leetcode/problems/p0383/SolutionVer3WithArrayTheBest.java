package ru.merkurev.leetcode.problems.p0383;

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
class SolutionVer3WithArrayTheBest {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] symbolsCount = new int[26];
        for (int sym : magazine.toCharArray()) {
            symbolsCount[sym - 'a']++;
        }

        for (int sym : ransomNote.toCharArray()) {
            if (symbolsCount[sym - 'a'] == 0) {
                return false;
            }
            symbolsCount[sym - 'a']--;
        }
        return true;
    }
}