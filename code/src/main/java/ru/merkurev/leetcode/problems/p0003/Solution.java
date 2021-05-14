package ru.merkurev.leetcode.problems.p0003;

import java.util.HashMap;

public class Solution {
  public int findLongestSubstringWithoutRepeatingCharacters(String s) {
    HashMap<Character, Integer> chars = new HashMap<>();
    int result = 0;
    int counter = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      Integer count = chars.getOrDefault(c, -1);
      if (count >= 0) {
        result = Math.max(result, counter);
        i = count;
        counter = 0;
        chars.clear();
        continue;
      }
      chars.put(c, i);
      counter++;
    }
    return Math.max(result, counter);
  }
}
