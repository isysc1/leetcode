package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/20
 */
class Solution49 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < n; i++) {
            int tmp = Math.min(Math.min(2 * dp[p2], 3 * dp[p3]), 5 * dp[p5]);
            if (tmp == 2 * dp[p2]) p2++;
            if (tmp == 3 * dp[p3]) p3++;
            if (tmp == 5 * dp[p5]) p5++;
            dp[i] = tmp;
        }
        return dp[n - 1];
    }
}
