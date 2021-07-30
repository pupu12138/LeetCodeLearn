import javax.swing.tree.TreeNode;

/**
 * @author WYZ
 * @creat 2021-07-31 1:07
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
//        未给出主方法
        return dfs(root) != -1;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        if (left == -1) return -1;
        int right = dfs(root.right);
        if (right == -1) return -1;
        return Math.abs(right - left) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
