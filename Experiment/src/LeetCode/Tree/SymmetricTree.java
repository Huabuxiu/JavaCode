package LeetCode.Tree;

/**
 * @program: 镜像对称
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-12 09:37
 **/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root,root);
    }

    public boolean Symmetric(TreeNode tree1,TreeNode tree2)
    {
        if (tree1 == null && tree2 == null)
            return true;
        if ((tree1 == null || tree2 ==null ))
            return false;
        return (tree1.val == tree2.val) && Symmetric(tree1.right,tree2.left)
                &&Symmetric(tree1.left,tree2.right);
    }
}
