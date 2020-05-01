package 程序员面试经典;

/**
 * @author isysc1@163.com
 * @date 2020/3/24
 */
public class Solution17_16 {
    public int massage(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = Math.max(b, a + nums[i]);
            a = b;
            b = c;
        }
        return b;
    }
}
