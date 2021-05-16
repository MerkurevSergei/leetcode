package ru.merkurev.leetcode.problems.p0003;

import java.util.HashSet;
import java.util.Set;

public class SolutionVer2 {
  public int findLongestSubstringWithoutRepeatingCharacters(String s) {
    int i = 0, j = 0, count = 0;
    Set<Character> chars = new HashSet<>();
    while (i < s.length()) {
      // add if absent
      if (!chars.contains(s.charAt(i))) {
        chars.add(s.charAt(i++));
        count = Math.max(count, chars.size());
      // or delete as long as it contains the character by i
      } else {
        chars.remove(s.charAt(j++));
      }
    }
    return count;
  }
}
