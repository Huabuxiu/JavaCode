package LeetCode.List;

import java.util.HashSet;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-08 10:38
 *
 * 83. 删除排序链表中的重复元素
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 **/
public class deleteDuplicates {

    public ListNode DeleteDuplicate(ListNode head){

        HashSet<Integer> set = new HashSet<>();
        ListNode p= head;
        if(p == null)
        {
            return p;
        }
        ListNode next = p.next;
        while (next !=null)
        {
            if (set.isEmpty())
            {
                set.add(p.val);
            }
            else {
                if (set.contains(next.val)) {
                    p.next = next.next;
                    next = p.next;
                    //删除节点
                } else if (!set.contains(next.val)) {
                    set.add(next.val);
                    p = next;
                    next = next.next;
                }
            }
        }
        return head;
    }
}
