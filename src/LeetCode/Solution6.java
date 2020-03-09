import java.util.ArrayList;
import java.util.List;

/**
 * @author isysc1@163.com
 * @date 2019/12/23
 */
class Solution6 {

    /**
     * 按顺序遍历字符串 s；
     * res[i]+=c：把每个字符 c 填入对应行
     * i+=flag： 更新当前字符 c 对应的行索引；
     * flag=-flag： 在达到 ZZ 字形转折点时，执行反向。
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }
        ;
        int nowRow = 0;
        boolean goDown = false;
        for (char c : s.toCharArray()) {
            rows.get(nowRow).append(c);
            if (nowRow == 0 || nowRow == numRows - 1)
                goDown = !goDown;
            nowRow += goDown ? 1 : -1;
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows)
            ret.append(row);
        return ret.toString();
    }
}
