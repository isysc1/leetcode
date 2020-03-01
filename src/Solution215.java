import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author isysc1@163.com
 * @date 2020/2/7
 */
public class Solution215 {

    /**
     * 直接调用库函数，排序直接取出
     *
     * @param nums
     * @param k
     * @return int
     */
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

//    PriorityQueue 一个基于优先级的无界优先级队列。优先级队列的元素按照其自然顺序进行排序，
//
//    利用最小堆的思想，把数组的元素都添加到PriorityQueue中，然后持续poll 往外弹数组元素
//    直到数组的size小于k，然后就是我们需要的答案
//
//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> min = new PriorityQueue<>();
//        for (int i = 0; i < nums.length; i++) {
//            min.offer(nums[i]);
//            if (min.size() > k) {
//                min.poll();
//            }
//        }
//        return min.peek();
//    }


}
