package OfferGogogo;

/**
 * @author isysc1@163.com
 * @date 2020/2/20
 */
public class SolutionO6 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int cnt = 0;
        while (!stack.isEmpty()) {
            res[cnt++] = stack.pop();
        }
        return res;
    }

}
