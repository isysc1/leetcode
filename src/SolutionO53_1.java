/**
 * @author isysc1@163.com
 * @date 2020/2/28
 */
public class SolutionO53_1 {
    /**
     * 暴力循环
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0) return 0;

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                count++;
                //有序的数组，当下一个不为target就跳出
                if (nums[i + 1] != target) break;
            }
        }
        //循环缺失了nums.length - 1下标，如果nums.length - 1下标为target需要补上一个
        if (nums[nums.length - 1] == target) count++;

        return count;
    }



}
