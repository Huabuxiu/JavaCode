package LeetCode.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-08 09:19
 **/
public class ListMain {

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static ListNode creatList(int num, int[] values)
    {
        ListNode head = new ListNode(values[0]);
        ListNode pr = head;
        List<ListNode> list = new ArrayList<>();
        for (int i =1; i< num;i++)
        {
            ListNode listNode;
            listNode = new ListNode(values[i]);
            pr.next = listNode;
            pr  = listNode;
        }
        return head;
    }

    public static void main(String[] args) {


        //链表的值数组
        int[] values = {1,2};
        //创建链表
        ListNode l1 = creatList(2,values);

        //执行算法
        ListNode ln = null;
        ln = new RemoveNthFromEnd().removeNthFromEnd(l1,2);
        //链表字符串化并输出
        String out = listNodeToString(ln);
        System.out.println(out);

    }

}
