package OfferGogogo;

/**
 * @author isysc1@163.com
 * @date 2020/3/11
 */
public class Solution65 {
    public int add(int a, int b) {
        int sum = 0;
        while (b != 0) {
            int temp = a ^ b; //除去相加位需要进位
            b = (a & b) << 1; //进位
            a = temp;
        }
        return a;
    }
}
