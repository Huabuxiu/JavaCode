package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-12 11:15
 **/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InorderTraversal {
    List<Integer> inorderlist = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return inorderlist;
        inorderTraversal(root.left);
        inorderlist.add(root.val);
        inorderTraversal(root.right);
        return inorderlist;
    }
}
