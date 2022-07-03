/**
 *  假设 s1 为 abc、 s2 为 dcba
 *  第一次循环的时候
 *  arr1 为 [1,1,1,...........]
 *  arr2 为 [0,0,0,1,.........]
 *  第二次循环的时候  arr2[s2.charAt(i - s1.length()) - 'a']--; 这一段代码其实就是将我们 arr2 数组 0，1，2 的位置重置
 *  然后 arr2[s2.charAt(i) - 'a']++; 这个就是去开始判断是否在数组中是否存在 s1 的子串
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
            arr2[s2.charAt(i - s1.length()) - 'a']--;
            arr2[s2.charAt(i) - 'a']++;
        }
        return Arrays.equals(arr1, arr2);
    }
}