package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/27
 */
public class Solution914 {
    public boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] counter = new int[10000];
        for (int num : deck) {
            counter[num]++;
        }
        // 迭代求多个数的最大公约数
        int x = -1;
        for (int cnt : counter) {
            if (cnt > 0) {
                x = x == -1 ? cnt : gcd(x, cnt);
                if (x == 1) { // 如果某步中gcd是1，直接返回false
                    return false;
                }
            }
        }
        return x != -1;
    }

    // 辗转相除法
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
