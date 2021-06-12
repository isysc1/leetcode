/**
 * Zhejiang Yunrong Innovation Technology Co. Ltd
 * Copyright 2015-2021 | www.yunrong.cn . All rights reserved .
 */

/**
 * @author Skow <yangsc@yunrong.cn>
 * @description
 * @date 2021/6/12 12:41 下午
 */
public class Solution714 {
    public static int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }
        // 动态规划,其中dp[i][0]表示第i天未持有股票，dp[i][1]表示持有股票
        int[][] dp = new int[n][2];
        // 初始化
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            // 未持有分为两种情况，有可能前一天未买入，这次也没买，也有可能卖掉原有的
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            // 持有分为两种，可能前一天没有，这次买入，也有可能前一天有，这次不买
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
        }
        return dp[n - 1][0];
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1,2,34,5,7,8};
        int fee = 2;
        maxProfit(prices, fee);
    }
}
