// /**
//  * @author isysc1@163.com
//  * @date 2020/2/15
//  */
// public class Solution338 {
//     /**
//      * 方法一：i & (i - 1)可以去掉i最右边的一个1（如果有），因此 i & (i - 1）是比 i 小的，而且i & (i - 1)的1的个数已经在前面算过了，所以i的1的个数就是 i & (i - 1)的1的个数加上1
//      *
//      * @param num
//      * @return
//      */
//     public int[] countBits(int num) {
//         int[] res = new int[num + 1];
//         for(int i = 1;i<= num;i++){  //注意要从1开始，0不满足
//             res[i] = res[i & (i - 1)] + 1;
//         }
//         return res;
//     }
//
//
//     /**
//      *方法二：i >> 1会把最低位去掉，因此i >> 1 也是比i小的，同样也是在前面的数组里算过。当 i 的最低位是0，则 i 中1的个数和i >> 1中1的个数相同；当i的最低位是1，i 中1的个数是 i >> 1中1的个数再加1
//      *
//      * @param num
//      * @return
//      */
//     public int[] countBits(int num) {
//         int[] res = new int[num + 1];
//         for(int i = 0;i<= num;i++){
//             res[i] = res[i >> 1] + (i & 1);  //注意i&1需要加括号
//         }
//         return res;
//     }
// }
