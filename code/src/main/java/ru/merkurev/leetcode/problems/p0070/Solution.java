package ru.merkurev.leetcode.problems.p0070;

/**
 * 70. Climbing Stairs
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * <p>
 * Constraints:
 * <p>
 * • 1 <= n <= 45<br>
 */
class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        for (int i = 2; i < n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
}