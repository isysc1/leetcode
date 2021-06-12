// /**
//  * Zhejiang Yunrong Innovation Technology Co. Ltd
//  * Copyright 2015-2021 | www.yunrong.cn . All rights reserved .
//  */
//
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
//
// /**
//  * @author Skow <yangsc@yunrong.cn>
//  * @description
//  * @date 2021/5/30 6:36 下午
//  */
// public class Solution491 {
//     public static List<List<Integer>> findSubsequences(int[] nums) {
//         if (nums.length == 1) {
//             return null;
//         }
//         ArrayList<List<Integer>> response = new ArrayList<>();
//         // 对数组进行排序
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 1; j < nums.length; j++) {
//                 ArrayList<Integer> tempList = new ArrayList<>();
//
//                 List<Integer> integers = response.get(response.get(0).size() > 0 ?response.get(0).size(): new ArrayList<Integer>() );
//                 integers.add(nums[j]);
//                 response.add(integers);
//             }
//         }
//         return response;
//     }
//
//     public static void main(String[] args) {
//         int nums[] = new int[4];
//         nums[0] = 4;
//         nums[1] = 6;
//         nums[2] = 7;
//         nums[3] = 9;
//         findSubsequences(nums);
//     }
// }
