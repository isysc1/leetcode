class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length <= 3) {
            return nums[0];
        }
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            if (i + 2 < nums.length && nums[i] == nums[i + 2]) {
            } else {
                return nums[i];
            }
            i += 3;
        }
        return nums[nums.length - 1];
    }
}