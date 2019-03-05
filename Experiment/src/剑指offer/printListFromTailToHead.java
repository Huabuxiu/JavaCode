package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-03-05 19:43
 *
 **/


// 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
public class printListFromTailToHead {

    class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
    }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack= new Stack<>();
        while (listNode != null)
        {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList= new ArrayList<>();
        while (!stack.empty())
        {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
