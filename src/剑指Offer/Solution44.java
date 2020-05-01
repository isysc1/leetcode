package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/12
 */
public class Solution44 {
    public int findNthDigit(int n) {
        int len = 1;
        long m = n, base = 1, temp = 0;
        while (m > (temp = 9 * base * len)) {
            m -= temp;
            ++len;
            base *= 10;
        }
        int num = (int) (base + (m - 1) / len);
        return String.valueOf(num).charAt((int) ((m - 1) % len)) - 48;
    }
}
