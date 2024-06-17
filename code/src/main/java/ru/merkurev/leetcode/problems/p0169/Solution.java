package ru.merkurev.leetcode.problems.p0169;

/**
 * 169. Majority Element
 * <p>
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * <p>
 * Constraints:
 * <p>
 * • n == nums.length<br>
 * • 1 <= n <= 5 * 104<br>
 * • -109 <= nums[i] <= 109
 * <p>
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }

        int e = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {

            if (count > nums.length / 2) {
                return e;
            }

            if (e == nums[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                e = nums[i];
                count = 1;
            }
        }
        return e;
    }
}