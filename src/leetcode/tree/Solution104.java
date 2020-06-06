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
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(1 + maxDepth(root.right),1 + maxDepth(root.left));
    }
}
