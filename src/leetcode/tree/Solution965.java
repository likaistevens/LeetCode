/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.tree;

/**
 *
 * @author kaili
 */
public class Solution965 {
    boolean b = true;
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        getTreenode(root, value);
        return b;
    }

    private TreeNode getTreenode(TreeNode root, int value) {
        if (root == null) {
            return root;
        }
        if (root.val != value) {
            System.out.println("修改了");
            b = false;
            return null;
        }
        System.out.println(root.val);
        getTreenode(root.left, value);
        getTreenode(root.right, value);
        return root;
    }

    public static void main(String[] args) {
        Solution965 s = new Solution965();
        int[] array = {1, 1, 2, 3, 1, 1};
        TreeNode root = new TreeNode(array);
        System.out.println(s.isUnivalTree(root));

    }
}
