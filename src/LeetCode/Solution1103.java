/**
 * @author isysc1@163.com
 * @date 2020/3/5
 */
public class Solution1103 {
    public int[] distributeCandies(int candies, int num_people) {

        int curr_give = 0;
        int[] res = new int[num_people];

        while (candies > 0) {

            res[curr_give % num_people] += Math.min(++curr_give, candies);
            candies -= curr_give;
        }

        return res;
    }
}
