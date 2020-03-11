package OfferGogogo;

/**
 * @author isysc1@163.com
 * @date 2020/2/18
 */
public class SolutionO57 {
    /**
     * 因为题目中有说到是自增的数组，所以这一题我们可以借助双指针，不是很快，但是内存消耗绝对是无敌，可以击败100%
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // 定义左指针
        int l = 0;
        // 定义右指针
        int r = nums.length - 1;
        // 左右指针未相遇一直while循环
        while (l < r) {
            // 如果左右指针的两个值刚好等于target，直接输出完事
            if ((nums[l] + nums[r]) == target) {
                result[0] = nums[l];
                result[1] = nums[r];
                return result;
            } else {
                // 这两步也很简单，好好参透
                if ((nums[l] + nums[r]) > target) r--;
                if ((nums[l] + nums[r]) < target) l++;
            }
        }
        return new int[]{};

    }
}
