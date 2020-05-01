package 程序员面试经典;

/**
 * @author isysc1@163.com
 * @date 2020/3/25
 */
class Solution46 {
    public int translateNum(int num) {
        if (num <= 9) {
            return 1;
        }
        //xyzcba
        int ba = num % 100;
        if (ba <= 9 || ba >= 26) {
            return translateNum(num / 10);
        } else {
            return translateNum(num / 10) + translateNum(num / 100);
        }
    }
}
