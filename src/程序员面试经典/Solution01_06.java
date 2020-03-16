package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/16
 */
public class Solution01_06 {
    /**
     * 该死的边界哈哈哈，一直出错调边界用了半天。
     * 答题思路：借助双指针，left不动，让right先走，然后计数count(也可以直接right - left + 1)
     *         碰到不重复的然后再让left = right就行啦，接下来看详细注释
     */
    public String compressString(String S) {
        // 解决一个case，加不加无所谓，问题不大
        // eg : "a" 碰到这样的直接跳过，不进行下面的步骤，没太大区别，可能会稍微快那么一丢丢丢丢
        if (S.length() == 1) {
            return S;
        }
        // 来个StringBulider来接住一会return的结果
        StringBuilder stringBuilder = new StringBuilder();
        // 来算一下S的总长度，避免right跑出去了（越界）
        int len = S.length();
        // 给我们的左右指针，以及count（统计次数 就是a2的2这样的次数）赋初始值
        int left = 0, right = 0, count = 0;
        // 转化为Char数组，以便于找出每个字母
        // eg : "isysc" -> ["i", "s", "y", "s", "c"]
        char[] temp = S.toCharArray();
        // 要是right 小于len，随便跑（不会越界）
        while (right < len) {
            // 如果左指针和右指针指向的值一直相等的话，就进行right++ 和 count++的操作
            while (temp[left] == temp[right]) {
                count++;
                right++;
                // 避免越界
                if (right == len) {
                    break;
                }
            }
            // 接住结果，然后重置一下ocunt，更改一下left的位置
            stringBuilder.append(temp[left]).append(count);
            left = right;
            count = 0;
        }
        // 结果需要String
        String result = stringBuilder.toString();
        // 看下我们的压缩的长度小，还是原来的String长度小，谁小谁输出
        return result = result.length() < S.length() ? result : S;
    }
}
