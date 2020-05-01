package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/2/26
 */
public class SolutionO15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count=0;
        while(n!=0)
        {
            // 与1进行与运算，计算出最右边是否为1
            count+=n&1;
            // 往右移动一位
            n=n>>>1;
        }
        return count;
    }
}
