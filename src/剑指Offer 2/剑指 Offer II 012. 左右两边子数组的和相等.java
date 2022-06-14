class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            //总和减去当前子数组和等于当前子数组和减去当前值，则满足条件
            if(sum-nums[i]==total-sum){
                return i;
            }
        }
        //若没有满足条件值，返回-1
        return -1;
    }
}