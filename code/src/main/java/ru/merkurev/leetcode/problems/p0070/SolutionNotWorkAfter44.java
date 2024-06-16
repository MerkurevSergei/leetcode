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
class SolutionNotWorkAfter44 {

    public int climbStairs(int n) {
        int k = 0;
        long res = 0;
        while (n >= k) {
            if (n == k) {
                System.out.println();
            }
            if (n - k > k) {
                long u = multiple(n - k, n);
                long d = multiple(0, k);
                res = res + u / d;
            } else {
                long u = multiple(k, n);
                long d = multiple(0, n - k);
                res = res + u / d;
            }
            k++;
            n--;
        }
        return (int) res;

    }

    private long multiple(int start, int end) {
        if (end == 0 || end == 1) {
            return 1;
        }
        long result = 1;
        for (int i = start + 1; i <= end; i++) {
            result = result * i;
        }
        return result;
    }
}