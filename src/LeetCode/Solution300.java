/**
 * @author isysc1@163.com
 * @date 2020/2/16
 */
public class Solution300 {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return 1;
        }
        int resMax = 1;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);

        for (int i = len - 1; i >= 0; i--) {
            // 遍历dp[i+1], dp[i+2]... 同时判断本元素是否能加入
            if (i == len - 1) {
                dp[i] = 1;
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (nums[i] < nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            resMax = Math.max(resMax, dp[i]);
        }

        return resMax;
    }


    public int lengthOfLIS(int[] nums) {
        /**
         dp[i]: 所有长度为i+1的递增子序列中, 最小的那个序列尾数.
         由定义知dp数组必然是一个递增数组, 可以用 maxL 来表示最长递增子序列的长度.
         对数组进行迭代, 依次判断每个数num将其插入dp数组相应的位置:
         1. num > dp[maxL], 表示num比所有已知递增序列的尾数都大, 将num添加入dp
         数组尾部, 并将最长递增序列长度maxL加1
         2. dp[i-1] < num <= dp[i], 只更新相应的dp[i]
         **/
        int maxL = 0;
        int[] dp = new int[nums.length];
        for (int num : nums) {
            // 二分法查找, 也可以调用库函数如binary_search
            int temp = 0, result = maxL;
            while (temp < result) {
                int mid = temp + (result - temp) / 2;
                if (dp[mid] < num)
                    temp = mid + 1;
                else
                    result = mid;
            }
            dp[temp] = num;
            if (temp == maxL)
                maxL++;
        }
        return maxL;
    }
}