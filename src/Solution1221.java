import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author isysc1@163.com
 * @date 2019/12/19
 */
// 先排序，设置最小值为第一个元素和第0个元素之间的绝对值，循环数组
public class Solution1221 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Math.abs(arr[1] - arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == min) {
                List<Integer> list1 = new ArrayList<>();
                list1.add(arr[i - 1]);
                list1.add(arr[i]);
                list.add(list1);
            } else if (Math.abs(arr[i] - arr[i - 1]) < min) {
                list.clear();
                List<Integer> list1 = new ArrayList<>();
                list1.add(arr[i - 1]);
                list1.add(arr[i]);
                list.add(list1);
                min = arr[i] - arr[i - 1];
            }

        }
        return list;
    }
}

// 第二种解法 相比第一种会简单
// 通过判断n来决定L和R，当n为0的时候，LR平衡
/**
//class Solution {
//    public int balancedStringSplit(String s) {
//        int num = 0;
//        int n = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='R')
//                n++;
//            if (s.charAt(i) == 'L')
//                n--;
//            if (n == 0)
//                num++;
//        }
//        return num;
//    }
//}
