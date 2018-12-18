package LeetCode.Tree;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-12-18 15:55
 **/
public class maximumDepth {
    public int maxDepth(TreeNode root) {
        if(root.left == null && root.right == null)
            return 1;
        else
            return 1+((maxDepth(root.left)>maxDepth(root.right))?maxDepth(root.left):maxDepth(root.right));

    }
}
