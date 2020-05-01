package LeetCode;

import java.util.Arrays;

/**
 * @author isysc1@163.com
 * @date 2020/3/28
 */
class Solution820 {
    public int minimumLengthEncoding(String[] words) {
        int N = words.length;
        // 反转每个单词
        String[] reversed_words = new String[N];
        for (int i = 0; i < N; i++) {
            String word = words[i];
            String rword = new StringBuilder(word).reverse().toString();
            reversed_words[i] = rword;
        }
        // 字典序排序
        Arrays.sort(reversed_words);

        int res = 0;
        for (int i = 0; i < N; i++) {
            if (i+1 < N && reversed_words[i+1].startsWith(reversed_words[i])) {
                // 当前单词是下一个单词的前缀，丢弃
            } else {
                res += reversed_words[i].length() + 1; // 单词加上一个 '#' 的长度
            }
        }
        return res;
    }
}