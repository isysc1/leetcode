/**
 * @author isysc1@163.com
 * @date 2020/3/1
 */
public class SolutionO43 {

//    public int countDigitOne(int n) {
//        int num = 0;
//        for (int i = 1; i <= n; i++) {
//            int temp = i;
//            while (temp > 0) {
//                if (temp % 10 == 1) {
//                    num++;
//                }
//                temp /= 10;
//            }
//        }
//        return num;
//    }

    public static int countDigitOne(int n) {

        //求每个位的数字所用
        int index = 1;
        //记录1的个数
        int count = 0;
        int high = n, cur = 0, low = 0;
        //由于high = n /(index*10) 中index *10 很容易越位
        //特修改如下
        while (high > 0) {
            high /= 10;
            cur = (n / index) % 10;
            low = n - (n / index) * index;
            //以下是计算的公式
            if (cur == 0) count += high * index;
            if (cur == 1) count += high * index + low + 1;
            if (cur > 1) count += (high + 1) * index;
            index *= 10;
        }
        return count;
    }


    public static void main(String[] args) {
        countDigitOne(501);
    }
}
