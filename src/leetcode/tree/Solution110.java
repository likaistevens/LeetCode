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
public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null)    return true;
        return Math.abs(depth(root.right) - depth(root.left)) < 2 && isBalanced(root.right) && isBalanced(root.left);
    }
    // 返回 root的最大深度
    public int depth(TreeNode root){
        if(root == null)    return 0;
        if(root.left == null && root.right == null) return 1;
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
}
