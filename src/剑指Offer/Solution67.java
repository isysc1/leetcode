package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/29
 */
class Solution67 {
    public int strToInt(String str) {
        int idx = 0;
        int length = str.length();
        while (idx < length && str.charAt(idx) == ' ') {
            idx++;
        }

        boolean isNegative = false;
        int ans = 0;

        if (idx < length && (str.charAt(idx) == '+' || str.charAt(idx) == '-')) {
            isNegative = str.charAt(idx) == '-' ? true : false;
            idx++;
        }

        while (idx < length && isDigit(str.charAt(idx))) {
            int num = str.charAt(idx) - '0';
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && num > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            idx++;
            ans = ans * 10 + num;
        }
        return isNegative ? -ans : ans;
    }

    private boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else {
            return false;
        }
    }
}