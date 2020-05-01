package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/2/18
 */
public class SolutionO55 {
    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        height(root);
        return flag;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) {
            flag = false;
        }
        return 1 + Math.max(left, right);
    }

}
