package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/26
 */
public class Solution56_1 {
    public int[] singleNumbers(int[] nums) {
        int ret = 0, a = 0, b = 0;
        for (int num : nums) {
            ret ^= num;
        }
        int h = 1;
        while ((ret & h) == 0) {
            h <<= 1;
        }
        for (int num : nums) {
            if ((h & num) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
