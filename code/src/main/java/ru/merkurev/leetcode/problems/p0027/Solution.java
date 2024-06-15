package ru.merkurev.leetcode.problems.p0027;

/**
 * 27. Remove Element.
 * <p>
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place. The order of the elements may be changed. Then return the
 * number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things::
 * <p>
 * • Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val. The remaining elements of nums are not
 * important as well as the size of nums.<br>
 * • Return k.
 * <p>
 * Constraints:
 * <p>
 * • 0 <= nums.length <= 100<br>
 * • 0 <= nums[i] <= 50<br>
 * • 0 <= val <= 100<br>
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int end = nums.length - 1;
        while (i <= end) {
            if (nums[i] == val && nums[end] != val) {
                nums[i] = nums[end];
                i++;
                end--;
                continue;
            }
            if (nums[i] != val) {
                i++;
            }
            if (nums[end] == val) {
                end--;
            }
        }
        return i;
    }
}