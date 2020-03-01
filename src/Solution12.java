
/**
 * @author isysc1@163.com
 * @date 2020/1/3
 */
public class Solution12 {

    /**
     * 把罗马数字和整数一一对应，通过while循环判断num值与整数的相减是否大于0，求出罗马数字
     */
    private static int[] nums = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private static String[] strings = new String[] {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num - nums[i] >= 0) {
                sb.append(strings[i]);
                num -= nums[i];
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
