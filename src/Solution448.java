import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author isysc1@163.com
 * @date 2020/2/12
 */
public class Solution448 {
    /**
     * 当你无视题目规定，就很快了（乐）。简单的双重for循环 外加一个新数组。代码简单易懂
     *
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list = new ArrayList<>();
        int len = nums.length;
        int []newnum = new int [len+1];
        for(int i = 0; i < len; i++){
            newnum[nums[i]] = nums[i];
        }
        for(int j = 1; j <newnum.length ; j++){
            if(newnum[j] == 0){
                list.add(j);
            }
        }
        return list;
    }
}
