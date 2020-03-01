/**
 * @author isysc1@163.com
 * @date 2020/1/6
 */
public class Solution1108 {
    /**
     * 这一题没啥好说的，用replace没有sb的快。简单暴力
     *
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
                continue;
            }
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}

