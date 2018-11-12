package LeetCode.List;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-12 11:48
 *
 * **删除链表的倒数第 n 个节点**
 *
 * [19. Remove Nth Node From End of List (Medium)]
 *
 * ```html
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 **/
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer,ListNode> map = new HashMap<>();
        int i=0;
        ListNode piont = head;
        while (piont!=null)
        {
            map.put(i,piont);
            i++;
            piont = piont.next;
        }
        ListNode node = map.get(i-n);

        //只有一个节点删除表中唯一一个节点
        if (head == node && node.next==null)
        {
            return null;
        }
        //表中多个节点，删除倒数第一个节点
        if (n == 1)
        {
            node = map.get(i-n-1);
            node.next = null;
            return head;
        }
        //删除剩下地方得节点
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
        return head;
    }
}
