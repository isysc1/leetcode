package OfferGogogo;

/**
 * @author isysc1@163.com
 * @date 2020/2/20
 */
public class SolutionO22 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode frontNode = head, behindNode = head;
        while (frontNode != null && k > 0) {
            frontNode = frontNode.next;
            k--;
        }
        while (frontNode != null) {
            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }
        return behindNode;
    }
}
