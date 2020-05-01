package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/4/1
 */
class Solution1111 {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int [seq.length()];
        int idx = 0;
        for(char c: seq.toCharArray()) {
            ans[idx++] = c == '(' ? idx & 1 : ((idx + 1) & 1);
        }
        return ans;
    }
}