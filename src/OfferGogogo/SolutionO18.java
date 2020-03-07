package OfferGogogo;

/**
 * @author isysc1@163.com
 * @date 2020/2/23
 */
public class SolutionO18 {
    /**
     * 借助一个临时变量node 当node的值和我们val相等的时候，就让我们的node指向node的下一个的下一个节点
     * 大家可以画图了解
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode deleteNode(ListNode head, int val) {
        //避免删除头结点
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

}
