package LeetCode.List;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-31 09:38
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 *
 *
 **/
public class ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode reverseList(ListNode head) {
            ListNode newhead=null,oldhead=head;
            ListNode temp = null;
            while (oldhead != null){
                temp = oldhead.next;
                oldhead.next = newhead;
                newhead = oldhead;
                oldhead = temp;
            }
            return newhead;
    }

    public  ListNode REv(ListNode head){

        //通过函数的堆栈进行链表的遍历
        //然后通过函数体进行逆转，
        //每次返回远链表的最后一个节点，也就是翻转之后的链表的头节点
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newHead = REv(next);
        next.next = head;
        head.next = null;
        return newHead;
    }

}
