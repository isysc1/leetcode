/**
 * @author isysc1@163.com
 * @date 2019/12/23
 */
class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        //每次固定一位 比较其他两位
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int res = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - ans) > Math.abs(target - res)) {
                    ans = res;
                }
                //如果目标值小于三数之和 end--
                if (target < res) {
                    end--;
                    //目标值大于三数之和 start++
                } else if (target > res) {
                    start++;
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }
}