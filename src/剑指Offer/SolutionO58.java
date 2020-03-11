package OfferGogogo;

/**
 * @author isysc1@163.com
 * @date 2020/2/21
 */
public class SolutionO58 {

    /**
     * 解法一简单粗暴
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() < 2 || n >= s.length()) return s;
        return s.substring(n) + s.substring(0, n);
    }


    /**
     * 解法二，粗暴简单
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i >= n) {
                s2 += s.charAt(i);
            } else {
                s1 += s.charAt(i);
            }
        }
        return s1 + s2;
    }
}
