package 剑指offer;

/**
 * @program: Experiment
 * @description:重建二叉树
 * @author: Huabuxiu
 * @create: 2019-03-06 09:05
 **/

//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            int plenght = pre.length;
            int ilenght = in.length;
            if (plenght==0 && ilenght==0)
            {
                return null;
            }
            return btConstruct(pre,in,0,plenght-1,0,ilenght-1);
    }

    public TreeNode btConstruct(int [] pre,int [] in,int pstart,int pend,int istart,int iend)
    {
        TreeNode tree = new TreeNode(pre[pstart]);
        tree.left = null;
        tree.right = null;
        if (pstart==pend && istart ==iend)
        {
            return tree;
        }
        //通过寻找根节点在中序遍历的位置划分左右子树
        int root;
        for (root=0;root<iend;root++)
        {
            if (in[root]==pre[pstart])
                break;
        }
        int Leftlenght= root - istart;
        int rightlenght= iend- root;
        if (Leftlenght>0)
        {
            tree.left = btConstruct(pre,in,pstart+1,pstart+Leftlenght,istart,root-1);
        }
        if (rightlenght >0)
        {
            tree.right = btConstruct(pre,in,pstart+1+Leftlenght,pend,root+1,iend);
        }
        return tree;
    }
}
