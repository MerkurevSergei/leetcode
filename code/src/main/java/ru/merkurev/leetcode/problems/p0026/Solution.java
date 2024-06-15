package ru.merkurev.leetcode.problems.p0026;

/**
 * 26. Remove Duplicates from Sorted Array.
 * <p>
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same.Then return the number
 * of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you
 * need to do the following things:
 * <p>
 * • Change the array nums such that the first k elements of nums contain the
 * unique elements in the order they were present in nums initially. The
 * remaining elements of nums are not important as well as the size of nums.<br>
 * • Return k.
 * <p>
 * Constraints:
 * <p>
 * • 1 <= nums.length <= 3 * 104<br>
 * • -100 <= nums[i] <= 100<br>
 * • nums is sorted in non-decreasing order.<br>
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int e = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (e != nums[i]) {
                e = nums[i];
                k++;
                nums[k] = e;
            }
        }
        return k + 1;
    }
}
