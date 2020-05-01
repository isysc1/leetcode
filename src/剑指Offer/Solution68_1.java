package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/4/3
 */
public class Solution68_1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null)
            return null;

        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);

        return root;
    }

}
