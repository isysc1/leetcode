package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/9
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int n = prices[0];
        int abs = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > n) {
                abs = Math.max(prices[i] - n, abs);
            } else {
                n = prices[i];
            }
        }
        return abs;
    }
}
