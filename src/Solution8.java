/**
 * @author isysc1@163.com
 * @date 2019/12/21
 */
public class Solution8 {
    /**
     * 利用ASCLL码值来判断，0的ASCLL的值是48, 9是57
     * 把我们的字符串转成charArray数组
     * 根据题意信息进行判断既可
     *
     * @param str
     * @return int
     */
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int bol = 1;
        int ans = 0;
        char[] cdhr = str.toCharArray();
        int i = 0;
        char c1 = '-';
        if (cdhr[0] == c1) {
            bol = -1;
            i = i + 1;
        } else {
            char c = '+';
            if (cdhr[0] == c) {
                i = i + 1;
            }
        }
        for (; i < str.length(); i++) {
            if (48 > str.charAt(i) || str.charAt(i) > 57) {
                break;
            }

            if (ans * bol > Integer.MAX_VALUE / 10 || ans * bol == Integer.MAX_VALUE / 10 && (cdhr[i] - 48) > 7) {
                return Integer.MAX_VALUE;
            }
            if (ans * bol < Integer.MIN_VALUE / 10 || ans * bol == Integer.MIN_VALUE / 10 && (cdhr[i] - 48) > 8) {
                return Integer.MIN_VALUE;
            }
            ans = ans * 10 + (cdhr[i] - 48);

        }
        ans = ans * bol;

        return ans;

    }

}
