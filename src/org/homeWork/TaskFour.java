package org.homeWork;

public class TaskFour {
    TreeNode root;

    public static void main(String[] args) {
        TaskFour p = new TaskFour();

        p.root = new TreeNode(1);
        p.root.left = new TreeNode(2);
        p.root.right = new TreeNode(3);
        p.root.left.left = new TreeNode(5);

        TaskFour q = new TaskFour();
        q.root = new TreeNode(1);
        q.root.left = new TreeNode(2);
        q.root.right = new TreeNode(3);
        q.root.left.left = new TreeNode(5);

        isSameTree(p.root, q.root);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}
