
package leetcode.love.offer2;


class Solution21 {
    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length-1;
        int temp = 0;
        while (l < r) {
            if (nums[l] % 2 == 0) {
                if (nums[r] % 2 == 0) {
                    r --;
                } else {
                    temp = nums[r];
                    nums[r] = nums[l];
                    nums[l]  = temp;
                }
            } else {
                l ++;
            }
        }
        return nums;
    }
}