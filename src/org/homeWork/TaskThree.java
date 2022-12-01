package org.homeWork;

import java.util.ArrayList;
import java.util.List;

public class TaskThree {
    TreeNode root;
    
    public static void main(String[] args) {
        TaskThree tree = new TaskThree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(5);

        binaryTreePaths(tree.root);
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;

        String current_path = Integer.toString(root.val);
        if (root.left == null && root.right == null) res.add(current_path);
        if (root.left != null) recFunc(root.left, current_path, res);
        if (root.right != null) recFunc(root.right, current_path, res);

        System.out.println(res);
        return res;
    }

    public static void recFunc(TreeNode node, String current_path, List<String> res) {
        current_path += "->" + node.val;
        if (node.left == null && node.right == null) {
            res.add(current_path);
            return;
        }
        if (node.left != null) recFunc(node.left, current_path, res);
        if (node.right != null) recFunc(node.right, current_path, res);
    }
}
