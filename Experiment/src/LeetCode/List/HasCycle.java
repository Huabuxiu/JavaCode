package LeetCode.List;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-14 08:41
 **/
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode piont = head.next;
        if (head ==null || head.next == null)
            return false;
        while (true)
        {
            if (piont.next == null)
                return false;
            if (piont == head)
                return true;
            piont = piont.next;
        }
    }

}
