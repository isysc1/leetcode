/**
 * @author isysc1@163.com
 * @date 2019/12/20
 */
public class Solution551 {

    /**
     * 这一题好像没什么好讲的，双指针跑起来
     *
     * @param s
     * @return boolean
     */
    public boolean checkRecord(String s) {
        int strLen = s.length();
        int aCount = 0;
        int lCount = 0;
        char a = 'A';
        char l = 'L';
        for (int i = 0; i < strLen; i++) {
            char temp = s.charAt(i);
            if (temp == a) {
                aCount += 1;
            }
            if (temp == l) {
                lCount += 1;
            } else {
                lCount = 0;
            }
            if (aCount > 1) {
                return false;
            }
            if (lCount > 2) {
                return false;
            }
        }
        return true;
    }

}
