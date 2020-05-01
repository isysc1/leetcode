package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/22
 */
class Solution945 {
    public static int minIncrementForUnique(int[] A) {
        int[] help = new int[100000];
        for (int i = 0; i < A.length; i++) {
            help[A[i]] += 1;
        }
        int count = 0;
        for (int j = 0; j < A.length; j++) {
            int tmp = j;
            while (help[j] >= 2) {
                count++;
                tmp += 1;
                while (help[tmp] == 0) {
                    help[tmp] += 1;
                    help[j] -= 1;
                    tmp = j;
                }
            }
        }
        return count;
    }
}