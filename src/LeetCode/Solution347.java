import java.util.HashMap;
import java.util.Map;

/**
 * @author isysc1@163.com
 * @date 2020/2/14
 */
public class Solution347 {
    /**
     * 其实这种题目，最能想到的就是统计完，然后按照统计的每个元素 的大小进行排序，当然这样的时间复杂度就是 O(nlogn) O(nlogn)O(nlogn)，我们先来看看这种解法：
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0, len = nums.length; i < len; ++i) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(map.entrySet());
        arrayList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        for (int i = 0; i < k; ++i) {
            list.add(arrayList.get(i).getKey());
        }
        return list;
    }

    /**
     * 第二种就是用桶排序的思想：
         1）先遍历一次数组，把每个元素的出现的次数存放在map中。
         2）创建一个数组A，把每个元素的出现的次数作为索引，把和出现的次数对应的元素存储list中存到数组中。
         3）从后向前遍历数组A，把出现的数组放到结果集中，确保结果集中的个数等于K
     *
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

//      把每个元素出现的次数作为索引，对应的值则是：由每个对应的出现的次数的元素组成的list。
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (bucket[value] == null) bucket[value] = new ArrayList();
            bucket[value].add(key);
        }

//      遍历桶数组，注意要从后向前遍历，这样出现的次数多的元素会先出现
        List<Integer> res = new ArrayList<>();
        for (int i = nums.length; i >=0 && res.size() < k ;i--) {
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
            }
        }
        return res;
    }
}
