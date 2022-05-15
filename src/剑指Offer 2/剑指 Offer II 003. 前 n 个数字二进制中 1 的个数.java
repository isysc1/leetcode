// 1、 确定dp数组以及下标的含义，dp[i]代表这个数字二进制中包含 1的个数

// 2、 确定递推公式，当 i 为奇数的时候 dp[i]=dp[i-1]， 当 i 为偶数的时候 dp[i]=dp[i/2],即 dp[i]=dp[i-1]+dp[i/2]。优化：dp[i]=dp[i>>1]+(i++%2)

// 3、 dp数组如何初始化 dp[0]=0

// 4、确定遍历顺序，从 0到小于等于 n 即可

// 5、举例推导dp数组

class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        if (n == 1) {
            return new int[] {0, 1};
        }
        if (n == 0) {
            return new int[] {0};
        }
        for (int i = 1; i < n + 1; )
            res[i] = res[i >> 1] + (i++ % 2);
        return res;
    }
}