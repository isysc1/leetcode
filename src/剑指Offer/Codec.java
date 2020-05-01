package 剑指Offer;

/**
 * @author isysc1@163.com
 * @date 2020/3/7
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return null;
        String ser = "";
        queue.offer(root);
        while (queue.peek() != null) {//队列不是空的
            TreeNode node = queue.poll();
            if (node == root) {
                ser = "[" + node.val;
            }
            if (node.left != null) {
                ser = ser + "," + node.left.val;
                queue.offer(node.left);
            } else {
                ser = ser + "," + "null";
            }
            if (node.right != null) {
                ser = ser + "," + node.right.val;
                queue.offer(node.right);
            } else {
                ser = ser + "," + "null";
            }
        }
        ser += "]";
        return ser;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //一个数组用于存储所有的节点，一个队列用于存储目前用的根节点
        if (data == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        data = data.substring(1, data.length() - 1);
        String[] strs = data.split(",");
        TreeNode treeRoot = new TreeNode(Integer.valueOf(strs[0]));
        queue.offer(treeRoot);
        int i = 1;
        while (queue.peek() != null) {
            TreeNode node = queue.poll();
            //左节点
            if (strs[i].equals("null")) {
                //左节点为空
                node.left = null;
            } else {
                TreeNode newNode = new TreeNode(Integer.valueOf(strs[i]));
                node.left = newNode;
                queue.offer(newNode);
            }
            //右节点
            if (strs[i + 1].equals("null")) {
                node.right = null;
            } else {
                TreeNode newNode = new TreeNode(Integer.valueOf(strs[i + 1]));
                node.right = newNode;
                queue.offer(newNode);
            }
            i = i + 2;
        }
        return treeRoot;
    }
}
