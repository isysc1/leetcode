package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/17
 */
public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int[] c = new int[26];
        for (char cc : chars.toCharArray()) {
            c[(int) (cc - 'a')] += 1;
        }
        int res = 0;
        a:
        for (String word : words) {
            int[] w = new int[26];
            for (char ww : word.toCharArray()) {
                w[(int) (ww - 'a')] += 1;
            }
            for (int i = 0; i < 26; i++) {
                if (w[i] > c[i]) {
                    continue a;
                }
            }
            res += word.length();
        }
        return res;
    }
}
