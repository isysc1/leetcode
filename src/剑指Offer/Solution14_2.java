package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/7
 */
public class Solution14_2 {
    public int cuttingRope(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }
}
