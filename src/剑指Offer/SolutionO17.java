package OfferGogogo;

/**
 * @author isysc1@163.com
 * @date 2020/2/25
 */
public class SolutionO17 {
    /**
     * 简单粗暴，击败200%的人
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n);
        int[] ans = new int[max - 1];
        for (int i = 1; i <= max - 1; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }
}
