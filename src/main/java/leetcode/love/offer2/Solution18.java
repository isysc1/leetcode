package leetcode.love.offer2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution18 {
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}