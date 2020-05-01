package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/13
 */
class Solution19 {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i <= p.length(); i++) {  // 初始化table第一行，第一列不用初始化，除了0,0。其他全是false
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {  // 从（1，1）坐标下更新剩余的table
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    if (p.charAt(j - 1) == '*') {
                        if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') {
                            dp[i][j] = dp[i][j - 2] || dp[i - 1][j] || dp[i - 1][j - 2];
                        } else { // 只能舍掉
                            dp[i][j] = dp[i][j - 2];
                        }
                    } // else 肯定是false，就不用管了
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}