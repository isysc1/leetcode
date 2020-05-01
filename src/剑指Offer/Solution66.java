package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/24
 */
class Solution66 {
    public int[] constructArr(int[] a) {
        int n = a.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= a[i], i++)       /* 从左往右累乘 */
            B[i] = product;
        for (int i = n - 1, product = 1; i >= 0; product *= a[i], i--)  /* 从右往左累乘 */
            B[i] *= product;
        return B;
    }
}
