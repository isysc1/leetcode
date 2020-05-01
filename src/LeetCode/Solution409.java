package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/19
 */
class Solution409 {
    public int longestPalindrome(String s) {
        int[] help = new int[58];
        int i = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            help[c - 'A']++;
            if (help[c - 'A'] == 2) {
                help[c - 'A'] = 0;
                count++;
            }
        }
        return count = s.length() > count * 2 ? count * 2 + 1 : count * 2;
    }
}