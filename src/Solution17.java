/**
 * @author isysc1@163.com
 * @date 2019/12/21
 */
public class Solution17 {

    /**
     * 用Map<Character, String[]>存放每个数字对应的字母数组
     * 考虑深度优先搜索，dfs中输入一个step变量表示目前进行到第几位数字
     * 递归结束后一定记得str = str.substring(0, str.length() - 1);将字符串最后一位删除
     */
    List<String> res = new ArrayList<String>();
    Map<Character, String[]> map = new HashMap<Character, String[]>();
    String str = "";

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return res;
        }
        map.put('2', new String[]{"a", "b", "c"});
        map.put('3', new String[]{"d", "e", "f"});
        map.put('4', new String[]{"g", "h", "i"});
        map.put('5', new String[]{"j", "k", "l"});
        map.put('6', new String[]{"m", "n", "o"});
        map.put('7', new String[]{"p", "q", "r", "s"});
        map.put('8', new String[]{"t", "u", "v"});
        map.put('9', new String[]{"w", "x", "y", "z"});
        dfs(digits, 0);
        return res;
    }

    public void dfs(String digits, int step) {
        int numLen = digits.length();
        if (step == digits.length()) {
            res.add(str);
            return;
        }
        char c = digits.charAt(step);
        String[] strArray = map.get(c);
        for (String s : strArray) {
            str += s;
            dfs(digits, step + 1);
            str = str.substring(0, str.length() - 1);
        }
    }

}
