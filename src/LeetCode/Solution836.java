package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/18
 */
class Solution836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec2[0] < rec1[2] && rec2[2] > rec1[0] && rec2[1] < rec1[3] && rec2[3] > rec1[1];
    }
}