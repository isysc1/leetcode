package LeetCode;

import java.util.Arrays;

/**
 * @author isysc1@163.com
 * @date 2020/3/13
 */
public class Solution169 {

    // 我来写个带注释的解法吧

    /**
     * 第一种解法就是摩尔投票法（给出评论中比较通俗易懂的说法
     * 核心就是对拼消耗。
     * 玩一个诸侯争霸的游戏，假设你方人口超过总人口一半以上，并且能保证每个人口出去干仗都能一对一同归于尽。最后还有人活下来的国家就是胜利。
     * 那就大混战呗，最差所有人都联合起来对付你（对应你每次选择作为计数器的数都是众数），或者其他国家也会相互攻击（会选择其他数作为计数器的数），但是只要你们不要内斗，最后肯定你赢。
     * 最后能剩下的必定是自己人。）
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        // 初始计数器为1
        int count = 1;
        // 假设存在最多的数字是数组的第一位
        int maj = nums[0];
        // 循环搞起来，一个个数字判断自己是不是出现最多的，
        // 如果自己和后面的数相同count就++，当count为0的时候就更换下一位数字为候选的出现最多的次数
        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    maj = nums[i + 1];
                }
            }
        }
        return maj;
    }

    /**
     * 因为出现最多的次数，占数组的1/2，ok，排个序如何？
     * 排序中间的数一定是占数组的1/2的数字
     * eg ：[1,4,3,3,3] -> [1,3,3,3,4]  nums[len/2] =3
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len / 2];
    }
}
