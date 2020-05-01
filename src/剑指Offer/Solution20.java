package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/13
 */
class Solution20 {
    public boolean isNumber(String s) {
        try {
            if (s.endsWith("f") || s.endsWith("d") || s.endsWith("F") || s.endsWith("D")) {
                throw new NumberFormatException();
            }
            double d = Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
