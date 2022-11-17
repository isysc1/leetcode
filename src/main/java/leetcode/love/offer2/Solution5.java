package leetcode.love.offer2;//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//
//
//
// 示例 1：
//
// 输入：s = "We are happy."
//输出："We%20are%20happy."
//
//
//
// 限制：
//
// 0 <= s 的长度 <= 10000
// Related Topics 字符串
// 👍 367 👎 0

import org.springframework.util.StringUtils;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution5 {
    public static String replaceSpace(String s) {
        StringBuilder resp = new StringBuilder();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            String sChar = String.valueOf(sChars[i]);
            sChar = " ".equals(sChar) ?  "%20" : sChar;
            resp.append(sChar);
        }
        return resp.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
