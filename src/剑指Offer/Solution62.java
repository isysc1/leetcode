package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/18
 */
class Solution62 {
    public int lastRemaining(int n, int m) {
        return n == 1 ? 0 : (lastRemaining(n - 1, m) + m) % n;
    }
}