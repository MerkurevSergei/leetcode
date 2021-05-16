package ru.merkurev.leetcode.problems.p0003;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionVer2Test {

  @Test
  public void findLongestSubstringWithoutRepeatingCharacters0() {
    int pos = new Solution().findLongestSubstringWithoutRepeatingCharacters("abcabcbb");
    assertEquals(3, pos);
  }
  
  @Test
  public void findLongestSubstringWithoutRepeatingCharacters1() {
    int pos = new SolutionVer2().findLongestSubstringWithoutRepeatingCharacters("bbbbb");
    assertEquals(1, pos);
  }
  
  @Test
  public void findLongestSubstringWithoutRepeatingCharacters2() {
    int pos = new SolutionVer2().findLongestSubstringWithoutRepeatingCharacters("pwwkew");
    assertEquals(3, pos);
  }

  @Test
  public void findLongestSubstringWithoutRepeatingCharacters3() {
    int pos = new SolutionVer2().findLongestSubstringWithoutRepeatingCharacters("");
    assertEquals(0, pos);
  }

  @Test
  public void findLongestSubstringWithoutRepeatingCharacters4() {
    int pos = new SolutionVer2().findLongestSubstringWithoutRepeatingCharacters(" ");
    assertEquals(1, pos);
  }

  @Test
  public void findLongestSubstringWithoutRepeatingCharacters5() {
    int pos = new SolutionVer2().findLongestSubstringWithoutRepeatingCharacters("dvdf");
    assertEquals(3, pos);
  }
}