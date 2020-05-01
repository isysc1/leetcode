package LeetCode;

/**
 * @author isysc1@163.com
 * @date 2020/3/23
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null) {
            if(fast.next != null && fast.next.next == null) {
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}