package ru.merkurev.leetcode.problems.p0001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    final HashMap<Integer, Integer[]> intMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      Integer[] indexes = intMap.get(nums[i]);
      if (indexes == null) {
        indexes = new Integer[2];
        indexes[0] = i;
      } else {
        indexes[1] = i;
      }
      intMap.put(nums[i], indexes);
    }
    final int[] answer = new int[2];
    for (Map.Entry<Integer, Integer[]> entry : intMap.entrySet()) {
      final Integer firstAdd = entry.getKey();
      final Integer secondAdd = target - firstAdd;
      final Integer[] indexes = intMap.get(secondAdd);
      if (firstAdd.equals(secondAdd)) {
        answer[0] = indexes[0];
        answer[1] = indexes[1];
        break;
      } else if (indexes != null) {
        answer[0] = entry.getValue()[0];
        answer[1] = indexes[0];
        break;
      }
    }
    return answer;
  }
}
