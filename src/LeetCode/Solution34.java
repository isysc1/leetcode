/**
 * @author isysc1@163.com
 * @date 2020/1/6
 */
public class Solution34 {

    /**
     * 先找到target的位置，然后由target的位置向两边扩展
     */
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length;
        int mid = (i + j) / 2;
        int p = -1;
        while (i < j) {  //找到target的位置
            if (nums[mid] == target) {
                p = mid;
                break;
            }
            if (nums[mid] > target) {
                if (j == mid) break;
                j = mid;
                mid = (i + j) / 2;
            } else {
                if (i == mid) break;
                i = mid;
                mid = (i + j) / 2;
            }
        }

        if (p == -1) {
            return new int[]{-1, -1};
        } else {  //在target所在位置向前向后查找
            int a = p, b = p;
            while (a > 0 && nums[a - 1] == target) a--;
            while (b < nums.length - 1 && nums[b + 1] == target) b++;
            return new int[]{a, b};
        }
    }
}
