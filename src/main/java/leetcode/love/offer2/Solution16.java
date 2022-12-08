package leetcode.love.offer2;

// 剑指 Offer 16. 数值的整数次方 https://leetcode.cn/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/

// 太骚了 递归进行求解

class Solution16 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1 / x;
        double half = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        return half * half * mod;
    }
}