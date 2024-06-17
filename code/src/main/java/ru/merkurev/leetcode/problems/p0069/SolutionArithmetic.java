package ru.merkurev.leetcode.problems.p0069;

/**
 * 69. Sqrt(x)
 * <p>
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator. For example, do
 * not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * <p>
 * Constraints:
 * <p>
 * • 0 <= x <= 231 - 1<br>
 */
class SolutionArithmetic {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }

        int count = 0;
        int sub = 1;
        while (x >= 0) {
            x = x - sub;
            sub = sub + 2;
            count++;
        }
        return count - 1;
    }
}
