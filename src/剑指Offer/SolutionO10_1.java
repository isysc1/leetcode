package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/02
 */
public class SolutionO10_1 {
    /**
     * 因为是排序好的数组，我们可以借助双指针，从数组的尾巴开始比较，
     * 光看代码不理解的话，可以自己带入数字写一遍流程，还是很容易理解的
     *
     * @param A
     * @param m
     * @param B
     * @param n
     */
    public void merge(int[] A, int m, int[] B, int n) {
        int k = m + n - 1, i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            // 三元表达式 如果A[i] < B[j]， A[k--] = B[j--]，否则等于A[i--]
            A[k--] = A[i] < B[j] ? B[j--] : A[i--];
        }
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
}
