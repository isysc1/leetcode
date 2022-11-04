package leetcode.love.offer1;

/**
 * 其实就是 10-1 的换一种问法，同样的动态规划直接解决
 */
class Solution10_2 {
    public int numWays(int n) {
        if(n == 0) {
            return 1;
        }
        if (n <= 2 ) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n;i++) {
            dp[i] = (dp[i -1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}